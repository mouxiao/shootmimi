package com.shoot.mimi.common.exception;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.persistence.OptimisticLockException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.expression.ParseException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * 全局异常处理
 * @author mouxiao
 * @since 2017年9月13日 上午9:40:38
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({ OptimisticLockException.class })
	@ResponseBody
	public ResponseEntity<?> handleOptimisticLockException(HttpServletRequest req, Exception e) {
		return errorResponse(req, e, "发生数制并发修改情况,请尝试刷新当前数据后,再进行相关操作!", HttpStatus.CONFLICT);
	}

	@ExceptionHandler({ ShootException.class })
	@ResponseBody
	public ResponseEntity<?> handleHisException(HttpServletRequest req, Exception e) {
		return errorResponse(req, e, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = NoHandlerFoundException.class)
	public ModelAndView defaultNotFoundHandler(HttpServletRequest req, Exception e) throws Exception {
		e.printStackTrace();
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName("/404");
		return mav;
	}

//	@ExceptionHandler({ MultitenancyAuthenticationException.class })
//	@ResponseBody
//	public ResponseEntity<?> handleUnauthenticationException(HttpServletRequest req, Exception e) {
//		return errorResponse(req, e, e.getMessage(), HttpStatus.UNAUTHORIZED);
//	}

	@ExceptionHandler({ DataIntegrityViolationException.class, SQLIntegrityConstraintViolationException.class })
	@ResponseBody
	public ResponseEntity<?> handleConflictException(HttpServletRequest req, Exception e) {
		return errorResponse(req, e, e.getMessage(), HttpStatus.CONFLICT);
	}

	@ExceptionHandler({ SQLException.class, DataAccessException.class, RuntimeException.class })
	@ResponseBody
	public ResponseEntity<?> handleSQLException(HttpServletRequest req, Exception e) {
		return errorResponse(req, e, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler({ IOException.class, ParseException.class, JsonParseException.class, JsonMappingException.class })
	@ResponseBody
	public ResponseEntity<?> handleParseException(HttpServletRequest req, Exception e) {
		return errorResponse(req, e, e.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({ InvalidKeyException.class, NoSuchAlgorithmException.class })
	@ResponseBody
	public ResponseEntity<?> handleHashException(HttpServletRequest req, Exception e) {
		return errorResponse(req, new Exception("Encrypt/Decrypt key is requested"), e.getMessage(), HttpStatus.LOCKED);
	}

	@ExceptionHandler({ Exception.class })
	@ResponseBody
	public ResponseEntity<?> handleAnyException(HttpServletRequest req, Exception e) {
		return errorResponse(req, e, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	protected ResponseEntity<ExceptionMessage> errorResponse(HttpServletRequest req, Throwable throwable,
			String message, HttpStatus status) {
		if (null != throwable) {
			throwable.printStackTrace();
			return response(new ExceptionMessage(req.getRequestURL().toString(), message, status.value()), status);
		} else {
			return response(null, status);
		}
	}

	protected <T> ResponseEntity<T> response(T body, HttpStatus status) {
		return new ResponseEntity<T>(body, new HttpHeaders(), status);
	}
}
