package com.playground.jiho.respository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.playground.jiho.domain.Board;
import com.playground.jiho.repository.BoardRepository;

@SpringBootTest
public class BoardRepositoryTests {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insertTest(){
        Board board = new Board(null, null);
        board.setTitle("제목");
        board.setContent("내용");

        boardRepository.save(board);

    }
}
