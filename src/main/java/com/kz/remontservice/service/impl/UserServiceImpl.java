package com.kz.remontservice.service.impl;

import com.kz.remontservice.exception.RemontException;
import com.kz.remontservice.model.entity.User;
import com.kz.remontservice.repository.UserRepository;
import com.kz.remontservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    
    private final UserRepository userRepository;
    
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id){
        Optional<User> optUser = userRepository.findById(id);
        if(optUser.isPresent())
            return optUser.get();

        throw new RemontException("User not found");
    }
}
