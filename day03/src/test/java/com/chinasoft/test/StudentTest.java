package com.chinasoft.test;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.chinasoft.mapper.GenderMapper;
import com.chinasoft.mapper.StudentMapper;
import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;
import com.chinasoft.util.SessionUtil;

public class StudentTest {
	
	/* ���һ���� Ƕ�ײ�ѯ */
	@Test
	public void testSelectOneAll() {
		SqlSession session =  SessionUtil.getSessionFactory().openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		Student student = mapper.selectOneAll(6);
		System.out.println(student);
	}
	
	

}
