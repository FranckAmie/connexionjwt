package com.example.exemplejwt.services;

import com.example.exemplejwt.entities.AppRole;
import com.example.exemplejwt.entities.AppUser;

import java.util.Collection;

public interface AppUserService {
    AppUser saveUser(AppUser user);
    AppUser getUser(String username);
    void addRoleToUser(String unername, String rolename);
    AppRole saveRole(AppRole role);
    AppRole getRole(String name);
    Collection<AppUser> getAllUsers();
}
