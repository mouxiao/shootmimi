package com.shoot.mimi.common.entity.base;

public class UpdateVersionInfo extends UpdateInfo implements VersionInfo{

	private Integer version;
	
	@Override
	public Integer getVersion() {
		return version;
	}

	@Override
	public void setVersion(Integer version) {
		this.version=version;
	}

}
