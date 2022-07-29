package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.StudentBean;

@Repository
public interface StudentRepository 
				extends CrudRepository<StudentBean,Long>{
	
}
