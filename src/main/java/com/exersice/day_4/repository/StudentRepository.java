package com.exersice.day_4.repository;

 import org.springframework.data.jpa.repository.JpaRepository;

import com.exersice.day_4.model.StudentEntity;

public interface StudentRepository  extends JpaRepository<StudentEntity, Integer>  {

}