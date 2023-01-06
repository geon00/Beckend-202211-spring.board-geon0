package com.geon0.board.service;

import org.springframework.stereotype.Service;

import com.geon0.board.dto.auth.AuthPostDto;
import com.geon0.board.dto.auth.LoginDto;
import com.geon0.board.dto.response.ResponseDto;

@Service
public class AuthService {

	public ResponseDto<LoginDto> login(AuthPostDto dto) {
		LoginDto result = new LoginDto("JWT", 3600000);
		return ResponseDto.setSuccess("", result);
	}
}
