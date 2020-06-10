package com.chinasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.pojo.Comment;
import com.chinasoft.service.impl.CommentMapperServiceImpl;

@Controller
@RequestMapping("/comment")
public class MyCommentController {
	
	@Autowired
	CommentMapperServiceImpl service;

	@RequestMapping("/test")
	@ResponseBody
	public String enterTest() {
		System.out.println("Entering enterTest...");
		
//		return "/WEB-INF/myComment.jsp";
		return "Test Successfully!";
	}
	
	
	@RequestMapping("/route")
	public String commentRouter(Model model) {
		System.out.println("Entering commentRouter...");
		
		model.addAttribute("username", "Asichurter");
		
		return "/mycomment";
	}
	
	@RequestMapping("/mycomment")
	public String toMyComment(Model model) {
		System.out.println("Entering toMyComment...");
		
		List<Comment> comments = service.selectCommentByUser("zhangsan");	// need to get username dynamically
		
		model.addAttribute("mycomments", comments);

		System.out.println(comments);
		
		return "/WEB-INF/myComment.jsp";
	}


}
