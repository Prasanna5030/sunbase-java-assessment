package com.sunbase.javaassessment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sunbase.javaassessment.entity.User;
import com.sunbase.javaassessment.repository.UserRepository;
import com.sunbase.javaassessment.service.UserService;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
    	user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

	public ResponseEntity<String> checkToken() {
	
		return  ResponseEntity.ok("true");
	}

	@Override
	public User updateUser(User user) {
		
		 return userRepository.save(user);	
		 }
}
