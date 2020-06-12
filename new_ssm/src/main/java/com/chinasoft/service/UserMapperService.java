package com.chinasoft.service;

import com.chinasoft.pojo.User;

public interface UserMapperService {
	//ŷ����
	User selectById(int id);
	
	void InsertByUser(User user);
	
	void deleteById(int id);
	
	void updateByUser(User user);
	
	User login(String username,String password);
}
