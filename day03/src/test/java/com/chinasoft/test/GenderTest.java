package com.chinasoft.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.chinasoft.mapper.GenderMapper;
import com.chinasoft.pojo.Gender;
import com.chinasoft.util.SessionUtil;

public class GenderTest {
	
	/* 一对多关联 嵌套查询 */
	@Test
	public void testSelectGenderAssociateStudent() {
		SqlSession session =  SessionUtil.getSessionFactory().openSession();
		GenderMapper mapper = session.getMapper(GenderMapper.class);
		Gender gender = mapper.selectGenderAssociateStudent(1);
		System.out.println(gender);
	}
	
	/* 一对多关联 嵌套结果映射 */
	@Test
	public void testSelectGenderAssociateStudent2() {
		SqlSession session =  SessionUtil.getSessionFactory().openSession();
		GenderMapper mapper = session.getMapper(GenderMapper.class);
		Gender gender = mapper.selectGenderAssociateStudent2(1);
		System.out.println(gender);
	}
}
