package com.playground.jiho.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardResponseDto {
    
    private Long bid;
    private String title;
    private String content;

    @Builder
    public BoardResponseDto(Long bid,String title, String content){
        this.bid = bid;
        this.title = title;
        this.content = content;
    }
}
