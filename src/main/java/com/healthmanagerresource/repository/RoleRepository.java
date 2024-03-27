package com.healthmanagerresource.repository;

import org.springframework.stereotype.Repository;

import com.healthmanagerresource.models.Role;
import com.healthmanagerresource.models.EnumRole;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(EnumRole name);
}
