package com.playground.jiho.service;

import java.util.List;

import com.playground.jiho.domain.Board;
import com.playground.jiho.dto.BoardRequestDto;

public interface BoardService {
    void insertBoard(Board board);

    public List<BoardRequestDto> getBoardList();
}
