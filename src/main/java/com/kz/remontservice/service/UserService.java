package com.kz.remontservice.service;

import com.kz.remontservice.model.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getUserById(Long id);

}
