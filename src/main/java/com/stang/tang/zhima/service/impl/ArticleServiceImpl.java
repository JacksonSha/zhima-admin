package com.stang.tang.zhima.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stang.tang.zhima.entity.Article;
import com.stang.tang.zhima.mapper.ArticleMapper;
import com.stang.tang.zhima.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;

	public Article getArticleById(int artId) {
		return articleMapper.getArticleById(artId);
	}

	public List<Article> getArticlesByPage(int page, int count) {
		return articleMapper.getArticlesByPage((page - 1) * count, count);
	}

}
