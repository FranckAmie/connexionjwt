package com.example.exemplejwt.repositories;

import com.example.exemplejwt.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}
