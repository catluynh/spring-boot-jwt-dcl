package com.springbootjwtdcl.service;

import com.springbootjwtdcl.entity.Token;

public interface TokenService {
	Token createToken(Token token);
	Token findByToken(String token);
}
