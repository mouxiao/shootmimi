package com.shoot.mimi.portal.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.shoot.mimi.common.entity.base.BaseShootInfoVersion;

import lombok.Data;

/**
 * 系统用户表
 * @since 2017-10-20 
 * @author DELL
 *
 */
@Data
@SuppressWarnings({})
public class PlaUser extends BaseShootInfoVersion implements UserDetails{
	
	private static final long serialVersionUID = -6639267955609194392L;
	
	private String userAccount;
	private String password;
	private String userName;
	private String nickName;
	private String status;
	private String email;
	private String phone;
	private String description;
	private String picUrl;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	@Override
	public String getPassword() {
		return this.password;
	}
	@Override
	public String getUsername() {
		return this.userName;
	}
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	@Override
	public boolean isEnabled() {
		return false;
	}
	
	
	/*public static void main(String[] args) {
		GeneralColumnEntityCodeUtils.getGeneralEntityField("USER_ACCOUNT_\r\n" + 
				"USER_NAME_\r\n" + 
				"NICK_NAME_\r\n" + 
				"STATUS_\r\n" + 
				"EMAIL_\r\n" + 
				"PHONE_\r\n" + 
				"DESCRIPTION_\r\n" + 
				"PIC_URL_");
	}*/

}
