package com.shoot.mimi.common.exception;

/**
 * 业务异常类
 * @author devp006
 * @since 2017年9月13日 上午9:19:54
 */
public class ShootException extends RuntimeException{

	private static final long serialVersionUID = 8426466280633202339L;
	
	public ShootException(){
		super();
	}

	public ShootException(Throwable cause){
		super(cause);
	}
	
	public ShootException(String message){
		super(message);
	}
}
