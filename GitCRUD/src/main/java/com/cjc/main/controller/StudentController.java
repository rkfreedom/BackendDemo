package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.inter.ServiceInter;
import com.cjc.main.model.Student;

@RestController
public class StudentController {

	@Autowired
	ServiceInter service;
	
	@PostMapping("/user")
	public Student postData(@RequestBody Student u) {
		
		return service.saveData(u);
	}
}
