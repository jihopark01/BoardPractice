package com.playground.jiho.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.playground.jiho.domain.Board;
import com.playground.jiho.dto.BoardRequestDto;
import com.playground.jiho.repository.BoardRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //생성자가 필요한 것들 생성해줌
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public void insertBoard(Board board) {
        boardRepository.save(board);
    }

    @Transactional
    @Override
    public List<BoardRequestDto> getBoardList() {
        List <Board> all = boardRepository.findAll();
        List<BoardRequestDto> boardDtoList = new ArrayList<>();

        for(Board board : all){

            BoardRequestDto boardDto = BoardRequestDto.builder()
                .title(board.getTitle())
                .content(board.getContent())
                .build();
            
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }
    
    
    
}
