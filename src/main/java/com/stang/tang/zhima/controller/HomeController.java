package com.stang.tang.zhima.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController extends BaseController {
	private static final String SUB_PAGE = "subPage";
	private static final Logger LOGGER = LoggerFactory
			.getLogger(HomeController.class);

	@RequestMapping("")
	private String getIndex(HttpServletRequest request) {
		LOGGER.info(getHostUrl(request));
		request.setAttribute(SUB_PAGE, "welcome");
		return "content/main";
	}

	@RequestMapping("/{nav}")
	private String getNavigation(HttpServletRequest request,
			@PathVariable(value="nav") String nav) {
		LOGGER.info(request.getRequestURI());
		switch (nav.toLowerCase()) {
		case "articles":
		case "edit":
		case "tags":
		case "comments":
		case "profile":
		case "icons":
			request.setAttribute(SUB_PAGE, nav);
			break;
		default:
			return "redirect:/";
		}
		return "content/main";
	}

}
