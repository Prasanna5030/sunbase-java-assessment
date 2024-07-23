package com.sunbase.javaassessment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbase.javaassessment.entity.User;

import jakarta.transaction.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String username);

}
