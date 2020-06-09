package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;

public interface GenderMapper {
	

	Gender   selectGenderWithUser(int id);
	
}
