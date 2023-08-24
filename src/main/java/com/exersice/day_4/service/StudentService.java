package com.exersice.day_4.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exersice.day_4.model.StudentEntity;
import com.exersice.day_4.repository.StudentRepository;

@Service
public class StudentService{
	
	@Autowired
	StudentRepository sr;
	
	public StudentEntity saveInfo(StudentEntity ss) {
		return sr.save(ss);
	}
	public List<StudentEntity> showInfo(){
		return sr.findAll();
	}
	public StudentEntity changeinfo(StudentEntity ss) {
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(StudentEntity ss) {
		sr.delete(ss);
	}
}