package com.example.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.Chapter_batch;
import com.example.project.repository.Chapter_batchRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TestController {
	
	@Autowired
	Chapter_batchRepo chapter_batchRepo;

	@GetMapping("/")
	public ModelAndView test() {
	
		Chapter_batch chapter_batch = new Chapter_batch();
		
		chapter_batch = chapter_batchRepo.selectCourseDetail(1);
				
		log.info(chapter_batch.getChapter().getName()+"......."+chapter_batch.getStart_date());
		
		return new ModelAndView("test");
	}
}
