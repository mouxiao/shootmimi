package com.shoot.mimi.common.entity.base;

import java.util.Date;
/**
 * 
 * @author mouxiao
 * @since 2017年9月13日 上午10:38:31
 */
public class CreateInfo extends IdInfo{

	private String createUser;
	private Date createTime;
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
