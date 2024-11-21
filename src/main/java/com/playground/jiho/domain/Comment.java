package com.playground.jiho.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cno;

    private String content;

    @ManyToOne
    @JoinColumn(name = "board_bno")
    private Board board;

    public void setContent(String content){
        this.content = content;
    }

    public void setBoard(Board board){
        this.board = board;
    }
    
}
