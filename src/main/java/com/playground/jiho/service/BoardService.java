package com.playground.jiho.service;

import java.util.List;

import com.playground.jiho.domain.Board;
import com.playground.jiho.dto.BoardRequestDto;
import com.playground.jiho.dto.BoardResponseDto;

public interface BoardService {
    void insertBoard(Board board);

    public List<BoardRequestDto> getBoardList();

    public BoardResponseDto getBoard(Long bno);
}
