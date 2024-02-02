package com.ms.boardback.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ms.boardback.dto.request.user.PatchNicknameRequestDto;
import com.ms.boardback.dto.request.user.PatchProfileImageRequestDto;
import com.ms.boardback.dto.response.ResponseDto;
import com.ms.boardback.dto.response.user.GetSignInUserResponseDto;
import com.ms.boardback.dto.response.user.GetUserResponseDto;
import com.ms.boardback.dto.response.user.PatchNicknameResponseDto;
import com.ms.boardback.dto.response.user.PatchProfileImageResponseDto;
import com.ms.boardback.entity.UserEntity;
import com.ms.boardback.repository.UserRepository;
import com.ms.boardback.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImplement implements UserService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email) {

        UserEntity userEntity = null;

        try {
            userEntity = userRepository.findByEmail(email);
            if (userEntity == null)
                return GetSignInUserResponseDto.noExistUser();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }

        return GetSignInUserResponseDto.success(userEntity);
    }

    @Override
    public ResponseEntity<? super GetUserResponseDto> getUser(String email) {
        UserEntity userEntity = null;
        try {
            userEntity = userRepository.findByEmail(email);
            if (userEntity == null)
                return GetUserResponseDto.noExistUser();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }

        return GetUserResponseDto.success(userEntity);
    }

    @Override
    public ResponseEntity<? super PatchNicknameResponseDto> patchNickname(PatchNicknameRequestDto dto, String email) {

        try {
            UserEntity userEntity = userRepository.findByEmail(email);
            if (userEntity == null)
                PatchNicknameResponseDto.noExistUser();

            String nickname = dto.getNickname();
            boolean existedNickname = userRepository.existsByNickname(nickname);
            if (existedNickname)
                return PatchNicknameResponseDto.duplicateNickname();

            userEntity.setNickname(nickname);
            userRepository.save(userEntity);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }
        return PatchNicknameResponseDto.success();
    }

    @Override
    public ResponseEntity<? super PatchProfileImageResponseDto> patchProfileImage(PatchProfileImageRequestDto dto,
            String email) {

        try {
            UserEntity userEntity = userRepository.findByEmail(email);
            if (userEntity == null)
                PatchProfileImageResponseDto.noExistUser();

            String profileImage = dto.getProfileImage();
            userEntity.setProfileImage(profileImage);
            userRepository.save(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }
        return PatchProfileImageResponseDto.success();
    }

}
