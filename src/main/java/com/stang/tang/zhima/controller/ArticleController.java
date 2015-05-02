package com.stang.tang.zhima.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stang.tang.zhima.entity.Article;
import com.stang.tang.zhima.service.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController extends BaseController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ArticleController.class);

	@Autowired
	private ArticleService articleService;

	@ResponseBody
	@RequestMapping(value = "/list/{page}", produces = P_JSON)
	private String getArticleList(@PathVariable("page") Integer page,
			HttpServletRequest request) {
		LOGGER.info(request.getRequestURI());
		List<Article> list = articleService.getArticlesByPage(page, 10);
		LOGGER.info(gson.toJson(list));
		return gson.toJson(list);
	}

	@ResponseBody
	@RequestMapping(value = "/view/{aid}", produces = P_JSON)
	private String getArticleById(@PathVariable("aid") Integer aid,
			HttpServletRequest request) {
		LOGGER.info(request.getRequestURI());
		Article art = articleService.getArticleById(aid);
		LOGGER.info(gson.toJson(art));
		return gson.toJson(art);
	}

}
