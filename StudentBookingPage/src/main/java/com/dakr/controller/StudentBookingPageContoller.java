package com.dakr.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.binding.StudentBookingBinding;
import com.dakr.entity.StudentBookingPage;
import com.dakr.service.StudentBookingPageService;

@RestController
public class StudentBookingPageContoller {
@Autowired
public StudentBookingPageService sbs;

@PostMapping("/save")
public StudentBookingPage display(@RequestBody StudentBookingBinding sbb){
	return sbs.saveData(sbb);
}
@GetMapping("/retrieve")
public Optional<StudentBookingPage> getDetails(@RequestParam Integer id ){
return sbs.getDetails(id);	
}
@GetMapping("/retrieveAll")
public List<StudentBookingPage> getAllDetails(){
	return sbs.getAllDetails();
}@PutMapping("/update")
public StudentBookingPage updateData(@RequestBody StudentBookingPage sbb) {
	return sbs.updateD(sbb);
}
@DeleteMapping("/delete")
public String deleteData(@RequestParam Integer id){
	return sbs.deleteD(id);
}

}
