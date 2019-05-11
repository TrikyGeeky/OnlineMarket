package com.nexeo.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexeo.market.model.User;
import com.nexeo.market.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUserById(Integer id) {
		return userRepository.getOne(id);
	}
	
	public List<User> getUserByLastName(String lastName) {
		return userRepository.getUserByLastName(lastName);
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}

}
