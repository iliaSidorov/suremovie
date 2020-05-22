package com.ilyasidorov.suremovies.controller;

import com.ilyasidorov.suremovies.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postService.findAllPosts());
        return "allPosts";
    }
}
