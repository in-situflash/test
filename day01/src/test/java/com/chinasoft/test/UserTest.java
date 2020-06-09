package com.chinasoft.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.chinasoft.pojo.User;

public class UserTest {

	public static void main(String[] args) throws IOException {
		 //addTest();
		// updateUserTest();
		// deleteUserTest();
		new UserTest().addTest();
	}

	public  void addTest() {
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();
			int insert = session.insert("com.chinasoft.mapper.UserMapper.addUser");
			// session提交
			session.commit();
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void updateUserTest() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		session.update("com.chinasoft.mapper.UserMapper.updateUser");
		// session提交
		session.commit();
		session.close();
	}

	public static void deleteUserTest() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		session.delete("com.chinasoft.mapper.UserMapper.deleteUser");
		// session提交
		session.commit();
		session.close();
	}

	public static void selectUserTest() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		User user = session.selectOne("com.chinasoft.mapper.UserMapper.selectUser");
		System.out.println(user);
		// session提交
		//session.commit();
		session.close();
	}

}
