package com.ilyasidorov.suremovies.service;

import com.ilyasidorov.suremovies.model.Post;
import com.ilyasidorov.suremovies.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }
}
