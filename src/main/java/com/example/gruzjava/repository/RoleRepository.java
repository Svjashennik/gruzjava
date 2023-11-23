package com.example.gruzjava.repository;

import com.example.gruzjava.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {
}