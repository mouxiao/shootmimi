package com.shoot.mimi.portal.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import com.shoot.mimi.portal.entity.PlaUser;

@MapperScan
public interface PlaUserMapper {
	
	@Select("select * from PLA_USER_ where USER_NAME_ = #{userName}")
	public PlaUser getUserOne(@Param(value = "userName")String userName);
}
