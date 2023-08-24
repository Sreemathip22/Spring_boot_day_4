package com.exersice.day_4.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exersice.day_4.model.StudentEntity;
import com.exersice.day_4.service.StudentService;


@RestController
public class StudentController{

	@Autowired
	StudentService sser;
	
	@PostMapping("addstudent")
	public StudentEntity add(@RequestBody StudentEntity ss)
	{
		return sser.saveInfo(ss);
	}
	@GetMapping("showdetails")
	public List<StudentEntity>show(){
		return sser.showInfo();
		}
	@PutMapping("update")
	public StudentEntity modify(@RequestBody StudentEntity ss)
	{
		return sser.changeinfo(ss);
	}
	@DeleteMapping("deletedetail")
	public String del(@RequestBody StudentEntity ss)
	{
		sser.deleteinfo(ss);
		return "Deleted Successfully";
	}
}