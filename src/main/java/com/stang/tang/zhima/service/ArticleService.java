package com.stang.tang.zhima.service;

import java.util.List;

import com.stang.tang.zhima.entity.Article;

public interface ArticleService {

	public Article getArticleById(int artId);

	public List<Article> getArticlesByPage(int page, int count);

}
