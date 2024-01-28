package com.ms.boardback.service;

import org.springframework.http.ResponseEntity;

import com.ms.boardback.dto.response.search.GetPopularListResponseDto;

public interface SearchService {
    
    ResponseEntity<? super GetPopularListResponseDto> getPopularList();
}
