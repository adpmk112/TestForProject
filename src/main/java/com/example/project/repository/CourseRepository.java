package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,Long> {
		
}
