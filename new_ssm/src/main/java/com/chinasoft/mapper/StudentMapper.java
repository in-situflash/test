package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.Student;

public interface StudentMapper {
	
	
	List<Student> SelectAllStudent();
	
	
	Student  SelectOneAll(int id);
	
}
