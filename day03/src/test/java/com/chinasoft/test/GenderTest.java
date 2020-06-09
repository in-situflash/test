package com.chinasoft.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.chinasoft.mapper.GenderMapper;
import com.chinasoft.pojo.Gender;
import com.chinasoft.util.SessionUtil;

public class GenderTest {
	
	/* һ�Զ���� Ƕ�ײ�ѯ */
	@Test
	public void testSelectGenderAssociateStudent() {
		SqlSession session =  SessionUtil.getSessionFactory().openSession();
		GenderMapper mapper = session.getMapper(GenderMapper.class);
		Gender gender = mapper.selectGenderAssociateStudent(1);
		System.out.println(gender);
	}
	
	/* һ�Զ���� Ƕ�׽��ӳ�� */
	@Test
	public void testSelectGenderAssociateStudent2() {
		SqlSession session =  SessionUtil.getSessionFactory().openSession();
		GenderMapper mapper = session.getMapper(GenderMapper.class);
		Gender gender = mapper.selectGenderAssociateStudent2(1);
		System.out.println(gender);
	}
}
