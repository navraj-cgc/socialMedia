package com.socialMedia.socialMedia.service;

import org.springframework.stereotype.Service;

import com.socialMedia.socialMedia.domain.Post;
import com.socialMedia.socialMedia.repositories.PostRepository;
@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository){
        this.postRepository=postRepository;
    }
    public Post createPost(String title, String text, String publishdate){
        Post post = new Post();
        post.setTitle(title);
        post.setText(text);
        post.setPublishdate(publishdate);
        return  postRepository.save(post);
    }
    public Post create(Post post, Long userId){
        return null;

    }
}

