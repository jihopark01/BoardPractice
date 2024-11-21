package com.playground.jiho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playground.jiho.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{
    
}
