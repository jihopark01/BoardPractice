package com.playground.jiho.domain;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Entity
@Getter
@Builder
@NoArgsConstructor
public class Board {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bid;

    private String title;

    private String content;

    @Builder.Default
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> commentList = new ArrayList<>();

    public void setTitle(String title){
        this.title = title;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void addCommentList(Comment comment){
        comment.setBoard(this);
        this.commentList.add(comment);
    }

    @Builder
    public Board(String title, String content){
        this.title =title;
        this.content = content;
    }


}
