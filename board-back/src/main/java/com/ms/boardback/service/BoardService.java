package com.ms.boardback.service;

import org.springframework.http.ResponseEntity;

import com.ms.boardback.dto.request.board.PostBoardRequestDto;
import com.ms.boardback.dto.request.board.PostCommentRequestDto;
import com.ms.boardback.dto.response.board.GetBoardResponseDto;
import com.ms.boardback.dto.response.board.GetCommentListResponseDto;
import com.ms.boardback.dto.response.board.GetFavoriteListResponseDto;
import com.ms.boardback.dto.response.board.PostBoardResponseDto;
import com.ms.boardback.dto.response.board.PostCommentResponseDto;
import com.ms.boardback.dto.response.board.PutFavoriteResponseDto;

public interface BoardService {
    ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);

    ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);

    ResponseEntity<? super PutFavoriteResponseDto> putFavorite(Integer boardNumber, String email);

    ResponseEntity<? super GetFavoriteListResponseDto> getFavoriteList(Integer boardNumber);

    ResponseEntity<? super PostCommentResponseDto> postComment(PostCommentRequestDto dto, Integer boardNumber, String email);

    ResponseEntity<? super GetCommentListResponseDto> getCommentList(Integer boardNumber);
}
