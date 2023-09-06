package com.dakr.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	public Optional<Student> findByemail(String email);
    public Optional<Student> findBypassWord(String passWord);
    public Optional<Student> findByphoneNumber(Long phoneNumber);
    public Optional<Student> findByconPassWord(String conPassWord);
}
