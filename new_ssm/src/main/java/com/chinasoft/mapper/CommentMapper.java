package com.chinasoft.mapper;

import java.util.List;

import com.chinasoft.pojo.Comment;

public interface CommentMapper {
	List<Comment> selectCommentByUser(String username);
}
