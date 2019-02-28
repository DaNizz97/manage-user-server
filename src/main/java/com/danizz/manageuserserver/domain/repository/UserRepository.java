package com.danizz.manageuserserver.domain.repository;

import com.danizz.manageuserserver.domain.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotBlank;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Iterable<User> findAllByFirstName(@NotBlank String firstName);

    Iterable<User> findAllByLastName(@NotBlank String lastName);

    void deleteById(Long id);

}
