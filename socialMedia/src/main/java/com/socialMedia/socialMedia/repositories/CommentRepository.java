package com.socialMedia.socialMedia.repositories;
import com.socialMedia.socialMedia.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Comment save(Comment comment);
    
}