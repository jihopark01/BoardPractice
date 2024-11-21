package com.playground.jiho.respository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.playground.jiho.domain.Board;
import com.playground.jiho.domain.Comment;
import com.playground.jiho.repository.BoardRepository;
import com.playground.jiho.repository.CommentRepository;

@SpringBootTest
public class CommentRepositoryTests {
    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void insertComment(){
        Comment comment = new Comment();
        comment.setContent("댓글입니다.2");

        Board board = new Board(null, null);
        board.setTitle("댓글 달린 게시글 제목2");
        board.setContent("댓글 달린 게시글 내용2");

        

        board.addCommentList(comment);

        boardRepository.save(board); //comment와 함께 db에 넣어줌

    }
}
