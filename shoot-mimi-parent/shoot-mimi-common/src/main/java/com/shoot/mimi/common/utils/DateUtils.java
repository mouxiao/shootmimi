package com.shoot.mimi.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * 时间工具类
 * @author devp006
 * @since 2017年9月13日 上午11:17:02
 */
public class DateUtils {

	/**
	 * 时间转换为字符串
	 * @param date
	 * @param pattern
	 * @return
	 */
	public String dateFormatString(Date date, String pattern){
		if(date == null){
			date = new Date();
		}
		if(StringUtils.isBlank(pattern)){
			pattern = "yyyy-MM-dd HH:mm:ss";
		}
		return DateFormatUtils.format(date, pattern);
	}
	
	/**
	 * 字符串转换为时间
	 * @param source
	 * @param pattern
	 * @return
	 * @throws ParseException
	 */
	public Date StringParseToDate(String source, String pattern) throws ParseException{
		if(StringUtils.isBlank(source) || StringUtils.isBlank(pattern)){
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.parse(source);
	}
	
}
