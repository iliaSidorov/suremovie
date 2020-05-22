package com.ilyasidorov.suremovies.repository;

import com.ilyasidorov.suremovies.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {

}
