package com.springbootjwtdcl.service;


import com.springbootjwtdcl.authen.UserPrincipal;
import com.springbootjwtdcl.entity.User;

public interface UserService {
	User createUser(User user);
	UserPrincipal findByUsername(String username);
}
