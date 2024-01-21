package com.ms.boardback.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ms.boardback.dto.request.board.PostBoardRequestDto;
import com.ms.boardback.dto.response.ResponseDto;
import com.ms.boardback.dto.response.board.PostBoardResponseDto;
import com.ms.boardback.entity.BoardEntity;
import com.ms.boardback.entity.ImageEntity;
import com.ms.boardback.repository.BoardRepository;
import com.ms.boardback.repository.ImageRepository;
import com.ms.boardback.repository.UserRepository;
import com.ms.boardback.service.BoardService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImplement implements BoardService {

    private final BoardRepository boardRepository;
    private final UserRepository userRepository;
    private final ImageRepository imageRepository;

    @Override
    public ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email) {
        try {

            Boolean existedEmail = userRepository.existsByEmail(email);
            if (!existedEmail)
                return PostBoardResponseDto.notExistUser();

            BoardEntity board = new BoardEntity(dto, email);
            boardRepository.save(board);

            int boardNumber = board.getBoardNumber();

            List<String> boardImageList = dto.getBoardImageList();
            List<ImageEntity> imageEntities = new ArrayList<>();

            for (String image : boardImageList) {
                ImageEntity imageEntity = new ImageEntity(boardNumber, image);
                imageEntities.add(imageEntity);
            }

            imageRepository.saveAll(imageEntities);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }
        return PostBoardResponseDto.success();
    }

}
