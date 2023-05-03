package com.cjc.main.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.inter.ServiceInter;
import com.cjc.main.model.Student;
import com.cjc.main.repo.Repo;

@Service
public class ServiceImpl implements ServiceInter {

	@Autowired
	Repo repo;
	
	@Override
	public Student saveData(Student p) {

		return repo.save(p);
	}

}
