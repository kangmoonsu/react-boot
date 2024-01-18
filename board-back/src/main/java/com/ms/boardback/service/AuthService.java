package com.ms.boardback.service;

import org.springframework.http.ResponseEntity;

import com.ms.boardback.dto.request.auth.SignUpRequestDto;
import com.ms.boardback.dto.response.auth.SignUpResponseDto;

public interface AuthService {
    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
}
