package com.ms.boardback.dto.response.board;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ms.boardback.common.ResponseCode;
import com.ms.boardback.common.ResponseMessage;
import com.ms.boardback.dto.object.BoardListItem;
import com.ms.boardback.dto.response.ResponseDto;
import com.ms.boardback.entity.BoardListViewEntity;

import lombok.Getter;

@Getter
public class GetUserBoardListResponseDto extends ResponseDto{
    
    private List<BoardListItem> userBoardList;

    private GetUserBoardListResponseDto(List<BoardListViewEntity> boardListViewEntities) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.userBoardList = BoardListItem.getList(boardListViewEntities);
    }

    public static ResponseEntity<GetUserBoardListResponseDto> success(List<BoardListViewEntity> boardListViewEntities) {
        GetUserBoardListResponseDto result = new GetUserBoardListResponseDto(boardListViewEntities);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDto> noExistUser() {
        ResponseDto result = new ResponseDto(ResponseCode.NOT_EXISTED_USER, ResponseMessage.NOT_EXISTED_USER);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }
}
