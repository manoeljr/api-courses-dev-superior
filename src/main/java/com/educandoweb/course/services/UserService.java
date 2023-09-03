package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;

import java.util.List;

public interface UserService {
    List<User> listUser();
    User findById(Long id);
}
