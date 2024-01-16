package com.ms.reactboot.common;

public interface ResponseCode {
    
    // 성공 (200)
    String SUCCESS = "SU"; 
    
    // 검증 실패 (400)
    String VALIDATION_FAILED = "VF";
    // 중복된 이메일 (400)
    String DUPLICATE_EMAIL = "DE";
    // 중복된 닉네임 (400)
    String DUPLICATE_NICKNAME = "DN"; 
    // 중복된 전화번호 (400)
    String DUPLICATE_TEL_NUMBER = "DT";
    // 존재하지 않는 유저 (400)
    String NOT_EXISTED_USER = "NU";
    // 존재하지 않는 게시물 (400)
    String NOT_EXISTED_BOARD = "NB";

    // 로그인 실패 (401)
    String SIGN_IN_FAIL = "SF";
    // 인증 실패 (401)
    String AUTHORIZATION_FAIL = "AF";
    
    // 권한 없음 (403)
    String NO_PERMISSION = "NP";
    
    // 데이터베이스 에러 (500)
    String DATABASE_ERROR = "DBE";
}
