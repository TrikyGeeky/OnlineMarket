package com.nexeo.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nexeo.market.model.User;
import com.nexeo.market.service.UserService;

@Controller
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(path="/add")
	public ResponseEntity<User> addUser (@RequestParam String firstName
			, @RequestParam String lastName) {
		User user = userService.saveUser(new User(firstName, lastName));
		if(user != null)
			return ResponseEntity.ok().body(user);
		else return ResponseEntity.unprocessableEntity().build();
	}
	
	@GetMapping(path = "/getUser/{id}")
	public ResponseEntity<User> getFirstUser(@PathVariable("id") Integer id){
		User user = userService.getUserById(id);
		return ResponseEntity.ok().body(user);
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userService.getAllUsers();
	}

}
