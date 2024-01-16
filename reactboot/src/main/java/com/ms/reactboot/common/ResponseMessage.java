package com.ms.reactboot.common;

public interface ResponseMessage {
    // 성공 (200)
    String SUCCESS = "Success"; 
    
    // 검증 실패 (400)
    String VALIDATION_FAILED = "Validation Failed";
    // 중복된 이메일 (400)
    String DUPLICATE_EMAIL = "Duplicate email";
    // 중복된 닉네임 (400)
    String DUPLICATE_NICKNAME = "Duplicate nickname"; 
    // 중복된 전화번호 (400)
    String DUPLICATE_TEL_NUMBER = "Duplicate tel number";
    // 존재하지 않는 유저 (400)
    String NOT_EXISTED_USER = "This user does not exist";
    // 존재하지 않는 게시물 (400)
    String NOT_EXISTED_BOARD = "This board does not exist";

    // 로그인 실패 (401)
    String SIGN_IN_FAIL = "Login information mismatch";
    // 인증 실패 (401)
    String AUTHORIZATION_FAIL = "Authoriazation Failed";
    
    // 권한 없음 (403)
    String NO_PERMISSION = "Do not have permission";
    
    // 데이터베이스 에러 (500)
    String DATABASE_ERROR = "Database error";
}
