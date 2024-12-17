package com.socialMedia.socialMedia.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.socialMedia.socialMedia.repositories.CommentRepository;
import com.socialMedia.socialMedia.repositories.PostRepository;
import com.socialMedia.socialMedia.repositories.UserRepository;
@Component
public class bootstrapData  implements CommandLineRunner{
    private final  CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;
    bootstrapData( CommentRepository commentRepository, PostRepository postRepository, UserRepository userRepository){
        this.commentRepository= commentRepository;
        this.postRepository= postRepository;
        this.userRepository= userRepository;
    }
    @Override
    public void run(String... args) throws Exception{}
    
}
