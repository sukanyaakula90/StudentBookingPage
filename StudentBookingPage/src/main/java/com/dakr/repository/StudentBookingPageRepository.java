package com.dakr.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.binding.StudentBookingBinding;
import com.dakr.entity.StudentBookingPage;
@Repository
public interface StudentBookingPageRepository extends JpaRepository<StudentBookingPage,Integer>{

	StudentBookingPage save(StudentBookingPage sbp);

	List<StudentBookingBinding> save(Integer id);

}
