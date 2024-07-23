package com.sunbase.javaassessment.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static  com.sunbase.javaassessment.entity.Permission.*;


@RequiredArgsConstructor
public enum Role{
    ADMIN(
            Set.of(
                    ADMIN_CREATE,
                    ADMIN_READ,
                    USER_CREATE,
                    USER_READ
            )
    ),
  USER(
            Set.of
            (
                    USER_READ,
                    USER_CREATE
            ));

    @Getter
    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getGrantedAuthorities(){
        List<SimpleGrantedAuthority> authorities= new java.util.ArrayList<>(getPermissions().stream().map(
                        role -> new SimpleGrantedAuthority(role.getPermission()))
                .toList());

        authorities.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
        return authorities;
    }


}
