package me.devkim.jpatestproject.controller;

import lombok.AllArgsConstructor;
import me.devkim.jpatestproject.domain.posts.PostsRepository;
import me.devkim.jpatestproject.domain.posts.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}
