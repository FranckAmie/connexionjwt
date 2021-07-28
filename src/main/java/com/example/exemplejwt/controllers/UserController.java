package com.example.exemplejwt.controllers;

import com.example.exemplejwt.entities.AppUser;
import com.example.exemplejwt.services.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@EnableWebSecurity
public class UserController {
   private final AppUserService appUserService;

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("getUsers")
    public ResponseEntity<Collection<AppUser>> getUser(){
        return ResponseEntity.ok().body(appUserService.getAllUsers());
    }

}
