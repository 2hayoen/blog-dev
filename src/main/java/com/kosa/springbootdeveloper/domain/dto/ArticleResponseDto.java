package com.kosa.springbootdeveloper.domain.dto;

import com.kosa.springbootdeveloper.domain.Article;
import lombok.Getter;

@Getter
public class ArticleResponseDto {

    private final String title;
    private final String content;

    public ArticleResponseDto(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
