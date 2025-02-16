package com.spring_data.formation.service;

import com.spring_data.formation.model.Comment;
import com.spring_data.formation.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Iterable<Comment> getComments() {
        return commentRepository.findAll();
    }

}
