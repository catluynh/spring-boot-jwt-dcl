package com.springbootjwtdcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjwtdcl.entity.User;
import com.springbootjwtdcl.service.UserService;


@RestController
public class AuthController {
	 @Autowired
	    private UserService userService;
	 
	 @PostMapping("/register")
	    public User register(@RequestBody User user){
	        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
	        return userService.createUser(user);
	    }
	 @GetMapping("/hello")
	    public String hello() {
		 return "hello";
	    }

}
