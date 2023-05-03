package com.cjc.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.Student;

public interface Repo extends JpaRepository<Student, Integer> {

}
