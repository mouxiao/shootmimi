package com.shoot.mimi.common.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionMessage {

	private int code;
	private String url;
	private String message;

	public ExceptionMessage(String url, String message, int code) {
		this.url = url;
		this.message = message;
		this.code = code;
	}

	@JsonProperty("error")
	public String getError() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
