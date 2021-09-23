package com.springbootjwtdcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springbootjwtdcl.entity.Token;
import com.springbootjwtdcl.repository.TokenRepository;
@Service
public class TokenServiceImpl implements TokenService{
	
	@Autowired
    private TokenRepository tokenRepository;
	
	@Override
	public Token createToken(Token token) {
		// TODO Auto-generated method stub
		return tokenRepository.saveAndFlush(token);
	}

	@Override
	public Token findByToken(String token) {
		// TODO Auto-generated method stub
		return tokenRepository.findByToken(token);
	}

}
