package com.socialMedia.socialMedia.repositories;
import com.socialMedia.socialMedia.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PostRepository extends JpaRepository<Post, Long> {

	Post save(Post post);

    
}
