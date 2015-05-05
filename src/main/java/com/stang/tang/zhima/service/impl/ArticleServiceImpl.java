package com.stang.tang.zhima.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stang.tang.zhima.entity.Article;
import com.stang.tang.zhima.mapper.ArticleMapper;
import com.stang.tang.zhima.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public void saveArticle(Article article) {
		articleMapper.createArticle(article);
		articleMapper.createXArticle(article);
	}

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public Integer updateArticle(Article article) {
		return articleMapper.updateArticle(article);
	}

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public Integer updateXArticle(Article article) {
		return articleMapper.updateXArticle(article);
	}

	public Article getArticleById(int artId) {
		return articleMapper.getArticleById(artId);
	}

	public List<Article> getArticlesByPage(int page, int count) {
		return articleMapper.getArticlesByPage((page - 1) * count, count);
	}

}
