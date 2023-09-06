package com.dakr.service;

import java.util.Optional;

import org.springframework.data.annotation.Transient;

import com.dakr.entity.Student;

public interface StudentService {

	String saveData(Student stu);

	Optional<Student>  getData(Integer id);

	String deleteData(Integer id);

	String updateData(Student student);

	


}
