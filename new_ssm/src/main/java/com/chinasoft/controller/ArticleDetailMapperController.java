package com.chinasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.pojo.ArticleDetail;
import com.chinasoft.service.impl.ArticleDetailMapperServiceImpl;


@Controller
@RequestMapping("/articleDetail")
public class ArticleDetailMapperController {

	@Autowired
	ArticleDetailMapperServiceImpl service;

	@RequestMapping("/getAll")
	public ModelAndView getAll() {
		ModelAndView mav = new ModelAndView();
		ArticleDetail articleDetail = service.getAllById(1);
		System.out.println(articleDetail);
		mav.addObject("articleDetail", articleDetail);
		mav.setViewName("/WEB-INF/comment.jsp");
		return mav;
	}
	
	
}
