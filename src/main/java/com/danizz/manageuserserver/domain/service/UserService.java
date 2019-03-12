package com.danizz.manageuserserver.domain.service;

import com.danizz.manageuserserver.domain.entity.User;

public interface UserService {

    Iterable<User> getAll();

    Iterable<User> getAllByFirstName(String firstName);

    Iterable<User> getAllByLastName(String lastName);

    User get(Long id);

    User save(User user);

    void deleteById(Long id);

}
