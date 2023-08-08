package com.sailingpappi.reverie.service;

import com.sailingpappi.reverie.dto.UserDto;
import com.sailingpappi.reverie.model.User;
import com.sailingpappi.reverie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleService roleService;

    public UserDto userToUserDto(User user) {
        UserDto userDto = new UserDto();

        userDto.setUserId(user.getUserId());
        userDto.setUsername(user.getUsername());
        userDto.setRoles(user.getRoles());
        return userDto;
    }

    public List<UserDto> findAll() {
        return userRepository.findAll().stream().map(this::userToUserDto).collect(Collectors.toList());
    }


}