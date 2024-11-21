package com.playground.jiho.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playground.jiho.domain.Board;
import com.playground.jiho.dto.BoardRequestDto;
import com.playground.jiho.repository.BoardRepository;
import com.playground.jiho.service.BoardService;
import com.playground.jiho.service.BoardServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {
    private final BoardService boardService;
    private final BoardServiceImpl boardServiceImpl;
    private final BoardRepository boardRepository;

    @PostMapping("/insertBoard")
    public Map insertBoard(@RequestBody Board board){
        boardService.insertBoard(board);
        return Map.of("Result","Success");
    }

    @GetMapping("/findPosts")
    public List<BoardRequestDto> findPosts(){
        return boardServiceImpl.getBoardList();
    }

}
