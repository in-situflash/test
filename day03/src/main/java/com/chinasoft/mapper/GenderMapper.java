package com.chinasoft.mapper;

import com.chinasoft.pojo.Gender;

public interface GenderMapper {
	/* һ�Զ���� Ƕ�ײ�ѯ */
	Gender selectGenderAssociateStudent(int id);
	
	/* һ�Զ���� Ƕ�׽��ӳ�� */
	Gender selectGenderAssociateStudent2(int id);
}
