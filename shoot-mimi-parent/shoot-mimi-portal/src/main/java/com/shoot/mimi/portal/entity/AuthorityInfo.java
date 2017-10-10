package com.shoot.mimi.portal.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

/**
 *  权限信息
 * Created by luoxx on 2017/10/6.
 */
@Data
public class AuthorityInfo implements GrantedAuthority {
    private static final long serialVersionUID = 1L;

    /**
     * 权限CODE
     */
    private String authority;

    public AuthorityInfo(String authority) {
        this.authority = authority;
    }

}
