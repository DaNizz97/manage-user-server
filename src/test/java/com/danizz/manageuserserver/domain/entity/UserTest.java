package com.danizz.manageuserserver.domain.entity;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class UserTest {

    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void whenNotBlankFullName_thenNotErrors() {
        User user = new User();
        user.setFirstName("NotNullUser");
        user.setLastName("LastName");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        assertEquals(0, violations.size());
    }

    @Test
    public void whenBlankBothNames_thenNwoConstraintViolations() {
        User user = new User();
        user.setFirstName("");
        user.setLastName("   ");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        assertEquals(2, violations.size());
    }
}