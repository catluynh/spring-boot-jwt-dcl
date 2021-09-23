package com.springbootjwtdcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjwtdcl.entity.Token;

public interface TokenRepository extends JpaRepository<Token, Long>{
	Token findByToken(String token);
}
