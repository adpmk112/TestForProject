package com.example.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.StudentBean;
import com.example.project.repository.StudentMapper;
import com.example.project.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TestController {
	
	@Autowired
	StudentRepository studentRepo;
	
	@Autowired
	StudentMapper studentMapper;

	@GetMapping("/")
	public ModelAndView test() {
		StudentBean studentBean = new StudentBean();
		log.info("ok");
		//studentBean.setName("qwe");
		//studentRepo.save(studentBean);
		
		studentBean.setId(1);
		studentBean = studentMapper.selectById(studentBean);
		
		log.info(studentBean.getName());
		
		return new ModelAndView("test");
	}
}
