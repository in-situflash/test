package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.pojo.User;


public interface UserMapper {
	
	User selectById(int id);
	
	void insertByUser(User user);
	
	void deleteById(int id);
	
	void updateByUser(User user);
	
	List<User> orderByAny(@Param("column") String column);
	
	/* ��̬����û� */
	void insertDynamic(User user);

	/* ��ҳ��ѯ */
	List<User> selectPaging(@Param("start") int start,@Param("end") int end);
}
