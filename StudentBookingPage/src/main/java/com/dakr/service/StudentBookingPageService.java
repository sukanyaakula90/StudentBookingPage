package com.dakr.service;
import java.util.List;
import java.util.Optional;

import com.dakr.binding.StudentBookingBinding;
import com.dakr.entity.StudentBookingPage;
public interface StudentBookingPageService {

	//StudentBookingPage display(StudentBookingBinding sbp);

	Optional<StudentBookingPage> getDetails(Integer id);
	
	List<StudentBookingPage> getAllDetails();

	StudentBookingPage saveData(StudentBookingBinding stu);

	StudentBookingPage updateD(StudentBookingPage sbp);

	String deleteD(Integer id);

}
