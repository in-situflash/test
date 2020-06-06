package com.chinasoft.mapper;

import com.chinasoft.pojo.Student;

public interface StudentMapper {
	/* 多对一关联 嵌套查询 */
	Student selectOneAll(int id);
	
	
}
