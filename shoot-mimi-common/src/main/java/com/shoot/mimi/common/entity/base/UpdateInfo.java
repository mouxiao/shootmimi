package com.shoot.mimi.common.entity.base;

import java.util.Date;

public class UpdateInfo extends CreateInfo{

	private String updateUser;
	
	private Date updateTime;

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
