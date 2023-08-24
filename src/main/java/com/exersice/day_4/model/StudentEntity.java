package com.exersice.day_4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable")
public class StudentEntity {
	@Id
public int id;
public String studentName;
public String deptName;
public String mailid;
public StudentEntity(int id, String studentName, String deptName, String mailid) {
	super();
	this.id = id;
	this.studentName = studentName;
	this.deptName = deptName;
	this.mailid = mailid;
}
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}


}
