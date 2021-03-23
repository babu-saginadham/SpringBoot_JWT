package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.jdbc.model.Role;
import com.app.jdbc.model.RoleName;

public interface RoleRepository extends JpaRepository<Role, Long> {

    boolean existsRoleByName(RoleName name);
    Role findByName(RoleName name);
    Optional<Role> findById(Long id);
}
