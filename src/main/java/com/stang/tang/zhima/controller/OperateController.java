package com.stang.tang.zhima.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

import com.stang.tang.zhima.entity.Article;
import com.stang.tang.zhima.entity.Response;

@Controller
@RequestMapping("/opt")
public class OperateController extends BaseController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(OperateController.class);

	@ResponseBody
	@RequestMapping(value = "/article/save", consumes = C_JSON, produces = P_JSON)
	private String optSaveArticle(@RequestBody Article article,
			HttpServletRequest request) {
		LOGGER.info(request.getRequestURI());
		LOGGER.info(gson.toJson(article));
		try {
			articleService.saveArticle(article);
			return gson.toJson(article);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return gson.toJson(new Response(500, e.getMessage()));
		}
	}

	@ResponseBody
	@RequestMapping(value = "/article/update", produces = P_JSON)
	private String optUpdateArticle(@RequestBody Article article,
			HttpServletRequest request) {
		LOGGER.info(request.getRequestURI());
		LOGGER.info(gson.toJson(article));
		try {
			int li = articleService.updateArticle(article);
			if (li == 1) {
				return gson.toJson(new Response(200, "Success"));
			}
			return gson.toJson(new Response(510, "Update 0 rows."));
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return gson.toJson(new Response(500, e.getMessage()));
		}
	}

}
