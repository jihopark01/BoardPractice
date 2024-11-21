package com.playground.jiho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playground.jiho.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
