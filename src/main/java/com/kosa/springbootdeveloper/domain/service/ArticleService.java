package com.kosa.springbootdeveloper.domain.service;


import com.kosa.springbootdeveloper.domain.Article;
import com.kosa.springbootdeveloper.domain.dto.ArticleAddRequestDto;
import com.kosa.springbootdeveloper.domain.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ArticleService {

    private final ArticleRepository articleRepository;    // private final  ~~ final ;; 한번 정의?하고 바뀌지 않도록함

    public Article save(ArticleAddRequestDto dto) {
        return articleRepository.save(dto.toEntity());
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
