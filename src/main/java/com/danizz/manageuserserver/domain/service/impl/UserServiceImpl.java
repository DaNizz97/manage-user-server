package com.danizz.manageuserserver.domain.service.impl;

import com.danizz.manageuserserver.domain.entity.User;
import com.danizz.manageuserserver.domain.exception.ResourceNotFoundException;
import com.danizz.manageuserserver.domain.repository.UserRepository;
import com.danizz.manageuserserver.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Iterable<User> getAllByFirstName(String firstName) {
        return userRepository.findAllByFirstName(firstName);
    }

    @Override
    public Iterable<User> getAllByLastName(String lastName) {
        return userRepository.findAllByLastName(lastName);
    }

    @Override
    public User get(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
