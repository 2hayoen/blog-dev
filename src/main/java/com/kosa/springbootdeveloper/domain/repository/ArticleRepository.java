package com.kosa.springbootdeveloper.domain.repository;

import com.kosa.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {


}
