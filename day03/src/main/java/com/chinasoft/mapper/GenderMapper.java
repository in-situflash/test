package com.chinasoft.mapper;

import com.chinasoft.pojo.Gender;

public interface GenderMapper {
	/* 一对多关联 嵌套查询 */
	Gender selectGenderAssociateStudent(int id);
	
	/* 一对多关联 嵌套结果映射 */
	Gender selectGenderAssociateStudent2(int id);
}
