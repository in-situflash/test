package com.chinasoft.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.User;
import com.chinasoft.util.SessionUtil;

public class UserTest {
	
	/* 测试动态添加用户 */
	@Test
	public void testInsertDynamic() {
		SqlSession session = SessionUtil.getSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user1 = new User(200, "name200", "newpwd","17000000200" , "sichuan", "200000200", 2);
		User user2 = new User();
		user2.setId(201);
		user2.setUsername("user201");
		user2.setPassword("200000201");
		user2.setAddress("optionAddr");
		mapper.insertDynamic(user1);
		mapper.insertDynamic(user2);
		session.commit();
		session.close();
	}
	
	/* 测试分页查询用户 */
	@Test
	public void testSelectPaging() {
		SqlSession session = SessionUtil.getSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		int quantityPerPage = 5;
		int page = 1;
		List<User> users= mapper.selectPaging((page-1)*quantityPerPage,quantityPerPage);
		System.out.println(users);
		page = 2;
		users= mapper.selectPaging((page-1)*quantityPerPage,quantityPerPage);
		System.out.println(users);
		session.close();
		
	}
	
	
	
	@Test
	public void selectOneByPar() {
		SqlSession session = SessionUtil.getSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.selectById(5);// 第一次执行sql语句
		System.out.println(user);

		// session.clearCache();// 清除一级缓存

		User user1 = mapper.selectById(5);// 第二次执行sql语句
		System.out.println(user1);

		session.close();

		System.out.println(user == user1);
	}

	@Test
	public void selectOneByParCache() {

		SqlSession session = SessionUtil.getSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.selectById(5);// 第一次执行sql语句 System.out.println(user);
		System.out.println(user);
		session.close();

		SqlSession session1 = SessionUtil.getSessionFactory().openSession();
		UserMapper mapper1 = session1.getMapper(UserMapper.class);
		User user1 = mapper1.selectById(5);// 第一次执行sql语句
		System.out.println(user1);
		session1.close();

		System.out.println(user == user1);

	}

	
	
	
	@Test
	public void testSelectById() {
		SqlSession session = SessionUtil.getSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.selectById(5);
		System.out.println(user);
		session.close();
	}
	
	public void testInsertByUser() {
		SqlSession session = SessionUtil.getSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User(100, "name03", "newpwd","17000000003" , "sichuan", "200000003", 2);
		mapper.insertByUser(user);
		session.commit();
		session.close();
	}
	
	public void testDeleteById() {
		SqlSession session = SessionUtil.getSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.deleteById(100);
		session.commit();
		session.close();
	}
	
	@Test
	public void testUpdateByUser() {
		SqlSession session = SessionUtil.getSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User(12, "name12", "newpwd","17000000012" , "sichuan", "200000012", 2);
		mapper.updateByUser(user);
		session.commit();
		session.close();
	}
	
	@Test
	public void testOrderByAny() {
		SqlSession session = SessionUtil.getSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> users = mapper.orderByAny("c_id");
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
	}
	
}
