package com.playground.jiho.dto;

import com.playground.jiho.domain.Board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@Getter
public class BoardRequestDto {

    private Long bid;
    private String title;
    private String content;

    @Builder
    public BoardRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }

    public Board ToEntity(){
        return Board.builder()
            .title(this.title)
            .content(this.content)
            .build();
    }

   
}
