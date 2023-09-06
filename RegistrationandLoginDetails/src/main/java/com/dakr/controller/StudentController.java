package com.dakr.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.entity.Student;
import com.dakr.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;

	@PostMapping("/save")
	public String saveData(@RequestBody Student stu) {
		return service.saveData(stu);
	}
	@GetMapping("/get{id}")
	public Optional<Student>  getData(@RequestParam Integer id) {
		 return service.getData(id);
}
	@DeleteMapping("/delete")
	public String delete(@RequestParam Integer id) {
		return service.deleteData(id);
	}
	@PutMapping("/update")
	public String update(@RequestBody Student student) {
		return service.updateData(student);
	}
	}