package com.springbootjwtdcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjwtdcl.entity.User;
import com.springbootjwtdcl.repository.UserRepository;

@Service
public class UserSeriviceImpl implements UserService{
	@Autowired
    private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.saveAndFlush(user);
	}

}
