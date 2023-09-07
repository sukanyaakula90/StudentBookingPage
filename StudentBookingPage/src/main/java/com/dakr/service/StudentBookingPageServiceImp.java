package com.dakr.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.binding.StudentBookingBinding;
import com.dakr.entity.StudentBookingPage;
import com.dakr.repository.StudentBookingPageRepository;
import com.dakr.utils.BookingIdUtils;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class StudentBookingPageServiceImp implements StudentBookingPageService {
@Autowired
private final BookingIdUtils bookingId;
@Autowired
public StudentBookingPageRepository sbr;

@Override
public StudentBookingPage saveData(StudentBookingBinding stu) {
	StudentBookingPage reg = new StudentBookingPage();
	reg.setBookingId(bookingId.generateSessionId());
	BeanUtils.copyProperties(stu, reg);
	return sbr.save(reg);
}
@Override
public Optional<StudentBookingPage> getDetails(Integer id) {
	return sbr.findById(id);
}
@Override
public List<StudentBookingPage> getAllDetails() {
	return sbr.findAll();
}
@Override
public StudentBookingPage updateD(StudentBookingPage sbp) {
	return sbr.save(sbp);
}
@Override
public String deleteD(Integer id) {
		String temp = "";
		if (sbr.findById(id).isPresent()) {
			sbr.deleteById(id);
			temp = "Data deleted successfully....";
		} else {
			temp = id + "Id is not present in the Data Base";
		}
		return temp;
	}
}

	



