package com.chinasoft.service;

import java.util.List;

import com.chinasoft.pojo.Comment;

public interface CommentMapperService {
	List<Comment> selectCommentByUser(String username);
}
