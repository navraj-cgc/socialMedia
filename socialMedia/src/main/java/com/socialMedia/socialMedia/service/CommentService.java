package com.socialMedia.socialMedia.service;

import org.springframework.stereotype.Service;

import com.socialMedia.socialMedia.User;
import com.socialMedia.socialMedia.domain.Comment;
import com.socialMedia.socialMedia.domain.Post;
import com.socialMedia.socialMedia.repositories.CommentRepository;
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    public CommentService( CommentRepository commentRepository){
        this.commentRepository=commentRepository;
    }

    public Comment CreateComment(User user, Post post, String text){
        Comment comment= new Comment();
         comment.setUser(user);
        comment.setPost(post);
        comment.setText(text);
        return  commentRepository.save(comment);
        
    }
}
