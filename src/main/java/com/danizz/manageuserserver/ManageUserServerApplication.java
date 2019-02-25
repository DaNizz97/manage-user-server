package com.danizz.manageuserserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ManageUserServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageUserServerApplication.class, args);
    }

}
