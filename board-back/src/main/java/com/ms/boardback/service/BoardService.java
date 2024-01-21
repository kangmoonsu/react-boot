package com.ms.boardback.service;

import org.springframework.http.ResponseEntity;

import com.ms.boardback.dto.request.board.PostBoardRequestDto;
import com.ms.boardback.dto.response.board.PostBoardResponseDto;

public interface BoardService {
    
    ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);
}
