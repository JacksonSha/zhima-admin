package com.stang.tang.zhima.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stang.tang.zhima.service.ArticleService;

public class BaseController {
	protected static Gson gson = new GsonBuilder().setDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

	public static String HOST_URL_VALUE = null;

	public static final String SESSION_USER = null;

	public static final String C_JSON = "application/json";
	public static final String P_JSON = "application/json;charset=UTF-8";
	public static final String P_TEXT = "text/plain;charset=UTF-8";

	@Autowired
	protected ArticleService articleService;

	private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

	protected String getHostUrl(HttpServletRequest request) {
		HttpSession session = request.getSession();
		ServletContext sc = session.getServletContext();
		HOST_URL_VALUE = (String) sc.getAttribute("HostUrl");
		if (HOST_URL_VALUE == null) {
			if (request.getScheme().equalsIgnoreCase("http")
					&& request.getServerPort() == 80
					|| request.getScheme().equalsIgnoreCase("https")
					&& request.getServerPort() == 443) {
				HOST_URL_VALUE = request.getScheme() + "://"
						+ request.getServerName() + request.getContextPath();
			} else {
				HOST_URL_VALUE = request.getScheme() + "://"
						+ request.getServerName() + ":"
						+ request.getServerPort() + request.getContextPath();
			}
			LOGGER.info(HOST_URL_VALUE);
			sc.setAttribute("HostUrl", HOST_URL_VALUE);
		}
		return HOST_URL_VALUE;
	}

}
