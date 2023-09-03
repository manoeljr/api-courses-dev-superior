package com.educandoweb.course.resources.dtos;

import com.educandoweb.course.entities.User;

public record UserCreateDTO(String name, String email, String phone, String password) {

    public User toUser() {
        User user = new User(null, name, email, phone, password);
        return user;
    }
}
