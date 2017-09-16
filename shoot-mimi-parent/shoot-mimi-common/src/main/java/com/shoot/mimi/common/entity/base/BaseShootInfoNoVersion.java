package com.shoot.mimi.common.entity.base;

public class BaseShootInfoNoVersion extends UpdateInfo implements DeleteFlagInfo{

	private String deleteFlag;

	@Override
	public String getDeleteFlag() {
		return deleteFlag;
	}

	@Override
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag=deleteFlag;
	}
	
}
