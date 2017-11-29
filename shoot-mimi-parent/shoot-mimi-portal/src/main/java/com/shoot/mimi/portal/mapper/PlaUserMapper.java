package com.shoot.mimi.portal.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.shoot.mimi.portal.entity.PlaUser;

@Mapper
public interface PlaUserMapper {
	
//	@Select("select * from PLA_USER_ where USER_NAME_ = #{userName}")
	public PlaUser getUserByUserName(@Param(value = "userName")String userName);
}
