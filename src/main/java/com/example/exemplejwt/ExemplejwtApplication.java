package com.example.exemplejwt;

import com.example.exemplejwt.entities.AppRole;
import com.example.exemplejwt.entities.AppUser;
import com.example.exemplejwt.services.AppUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class ExemplejwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExemplejwtApplication.class, args);
    }

    @Bean
    CommandLineRunner run(AppUserService userService){
        return args -> {
            AppRole roleAdmin = userService.saveRole(new AppRole(null, "ADMIN"));
            AppRole roleAgent= userService.saveRole(new AppRole(null, "AGENT"));
            AppRole roleClient = userService.saveRole(new AppRole(null, "CLIENT"));

            userService.saveUser(new AppUser(null, "User 1", "user1","123", Arrays.asList(roleClient, roleAdmin)));
            userService.saveUser(new AppUser(null, "User 2", "user2","123", Arrays.asList(roleAdmin)));
            userService.saveUser(new AppUser(null, "User 3", "user3","123", new ArrayList<>()));
            userService.saveUser(new AppUser(null, "User 4", "user4","123", new ArrayList<>()));


        };
    }

}
