package com.educandoweb.course.services.impl;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.UserService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository userRepository) {
        this.repository = userRepository;
    }

    @Override
    public List<User> listUser() {
        return repository.findAll().stream().toList();
    }

    @Override
    public User findById(Long id) {
        Optional<User> user =  repository.findById(id);
        return user.get();
    }

}
