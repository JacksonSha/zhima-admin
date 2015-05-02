package com.stang.tang.zhima.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.stang.tang.zhima.entity.Article;

public interface ArticleMapper {

//	public void createArticle(Article article);
//
//	public void updateArticle(Article article);
//
//	public List<Article> getAllArticles();
//
//	public int getArticlesNum();

	public Article getArticleById(Integer artId);

	public List<Article> getArticlesByPage(@Param("limit") Integer limit,
			@Param("count") Integer count);
//
//	public List<Article> getArticlesByDate(int count);
//
//	public List<Article> getArticlesByClick(int count);
//
//	public List<Article> getArticlesByLike(int count);

}
