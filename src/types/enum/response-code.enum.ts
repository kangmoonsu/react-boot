enum ResponseCode {
    // 성공 (200)
    SUCCESS = "SU",

    // 검증 실패 (400)
    VALIDATION_FAILED = "VF",
    // 중복된 이메일 (400)
    DUPLICATE_EMAIL = "DE",
    // 중복된 닉네임 (400)
    DUPLICATE_NICKNAME = "DN",
    // 중복된 전화번호 (400)
    DUPLICATE_TEL_NUMBER = "DT",
    // 존재하지 않는 유저 (400)
    NOT_EXISTED_USER = "NU",
    // 존재하지 않는 게시물 (400)
    NOT_EXISTED_BOARD = "NB",

    // 로그인 실패 (401)
    SIGN_IN_FAIL = "SF",
    // 인증 실패 (401)
    AUTHORIZATION_FAIL = "AF",

    // 권한 없음 (403)
    NO_PERMISSION = "NP",

    // 데이터베이스 에러 (500)
    DATABASE_ERROR = "DBE",

}

export default ResponseCode