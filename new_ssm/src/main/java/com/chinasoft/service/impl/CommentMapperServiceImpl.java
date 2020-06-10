package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.mapper.CommentMapper;
import com.chinasoft.pojo.Comment;
import com.chinasoft.service.CommentMapperService;

@Service
public class CommentMapperServiceImpl implements CommentMapperService{

	@Autowired
	CommentMapper mapper;
	
	public List<Comment> selectCommentByUser(String username){
		List<Comment> comments = mapper.selectCommentByUser(username);
		
		return comments;
	}
}
