package com.stang.tang.zhima.service;

import java.util.List;

import com.stang.tang.zhima.entity.Article;

public interface ArticleService {

	public void saveArticle(Article article);

	public Integer updateArticle(Article article);

	public Article getArticleById(int artId);

	public List<Article> getArticlesByPage(int page, int count);

}
