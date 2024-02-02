package com.ms.boardback.service;

import org.springframework.http.ResponseEntity;

import com.ms.boardback.dto.request.user.PatchNicknameRequestDto;
import com.ms.boardback.dto.request.user.PatchProfileImageRequestDto;
import com.ms.boardback.dto.response.user.GetSignInUserResponseDto;
import com.ms.boardback.dto.response.user.GetUserResponseDto;
import com.ms.boardback.dto.response.user.PatchNicknameResponseDto;
import com.ms.boardback.dto.response.user.PatchProfileImageResponseDto;

public interface UserService {

    ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email);

    ResponseEntity<? super GetUserResponseDto> getUser(String email);

    ResponseEntity<? super PatchNicknameResponseDto> patchNickname(PatchNicknameRequestDto dto, String email);

    ResponseEntity<? super PatchProfileImageResponseDto> patchProfileImage(PatchProfileImageRequestDto dto, String email);
}
