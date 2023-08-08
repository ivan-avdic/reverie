package com.sailingpappi.reverie.service;

import com.sailingpappi.reverie.enums.RoleEnum;
import com.sailingpappi.reverie.model.Role;
import com.sailingpappi.reverie.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Set<Role> setRoleUser(){
        // getUserRoles
        Role role = roleRepository.findByRole(RoleEnum.USER.getRole());
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        return roles;
    }
    public Set<Role> setRoleAdmin(){
        // getAdminRoles
        Role role1 = roleRepository.findByRole(RoleEnum.USER.getRole());
        Role role2 = roleRepository.findByRole(RoleEnum.ADMIN.getRole());
        Set<Role> roles = new HashSet<>();
        roles.add(role1);
        roles.add(role2);
        return roles;
    }
}
