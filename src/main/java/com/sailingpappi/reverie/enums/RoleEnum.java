package com.sailingpappi.reverie.enums;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@Getter
public enum RoleEnum implements GrantedAuthority {
    USER, ADMIN;

    private String prefix = "ROLE_";

    @Override
    public String getAuthority() {
        return prefix + name();
    }

    public String getRole() {
        return name();
    }
}
