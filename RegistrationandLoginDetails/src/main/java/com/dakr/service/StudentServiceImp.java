package com.dakr.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.entity.Student;
import com.dakr.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{
 @Autowired
 private StudentRepository repo;
private Student stu ;

@Override
public String saveData(Student stu) {
	String temp="";
	if(repo.findByemail(stu.getEmail()).isPresent()&& repo.findByphoneNumber(stu.getPhoneNumber()).isPresent()) {
		System.out.println("Student already registered.....");
		temp="Student already registered.....";
	}else {
		if(repo.findBypassWord(stu.getPassWord()).equals(repo.findByconPassWord(stu.getConPassWord()))) {
			stu.getName();
			stu.getEmail();
			stu.getPhoneNumber();
			stu.getPassWord();
			stu.getConPassWord();
			repo.save(stu);
			temp="registration completed successfully.....";
			}
		else {
			System.out.println("Please enter the correct password");
			temp="Please enter the correct password";
		}
	}
	
	return temp;
}
@Override
public Optional<Student> getData(Integer id) {
	return repo.findById(id);
	
}
@Override
public String deleteData(Integer id) {
	Optional<Student> stu = repo.findById(id);
	String temp = " ";
	if(stu.isPresent()) {
		repo.deleteById(id);
		 temp =" Data deleted Sucessfully";
	}
	else {
		System.out.println( "Invalid Id");
		temp = "Invalid Id";
	}
	return temp;
	}
@Override
public String updateData(Student student) {
	repo.save(student);
	return "data updated sucessfully";
}
}


