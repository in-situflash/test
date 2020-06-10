package com.chinasoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.mapper.ArticleDetailMapper;
import com.chinasoft.pojo.ArticleDetail;
import com.chinasoft.service.ArticleDetailMapperService;

@Service
public class ArticleDetailMapperServiceImpl implements ArticleDetailMapperService{

	@Autowired
	ArticleDetailMapper mapper;
	
	@Override
	public ArticleDetail getAllById(int a_id) {
		ArticleDetail articleDetail = mapper.getAllById(a_id);
		return articleDetail;
	}

}
