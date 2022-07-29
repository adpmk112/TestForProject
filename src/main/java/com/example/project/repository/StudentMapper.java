package com.example.project.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.project.model.StudentBean;

@Mapper
public interface StudentMapper {

	final String selectById = 
			"SELECT * FROM `student` WHERE `id`=#{id}";
	
	@Select(selectById)
	StudentBean selectById(StudentBean studentBean);
	
}
