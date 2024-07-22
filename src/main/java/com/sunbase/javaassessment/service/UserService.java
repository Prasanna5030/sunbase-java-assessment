package com.sunbase.javaassessment.service;

import java.util.List;

import com.sunbase.javaassessment.entity.User;

public interface UserService {
	List<User> getAllUsers();
	User getUserById(Integer id);
	User saveUser(User user);
	void deleteUser(Integer id);
}
