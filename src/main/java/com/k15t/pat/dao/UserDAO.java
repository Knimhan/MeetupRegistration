package com.k15t.pat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.k15t.pat.entity.UserEntity;

public interface UserDAO extends JpaRepository<UserEntity, Integer>
{
    UserEntity findByEmail(String email);
}
