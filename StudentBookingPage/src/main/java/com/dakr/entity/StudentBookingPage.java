package com.dakr.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="StudentBooking_TBL")

public class StudentBookingPage {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String bookingId;
private String firstName ;
private String lastName;
private Long phno;
private String email;
private String gender;
private Integer age;
private String parentName;
private Long parentPhNo;
private String identityProof;
private String identityProofNumber;
private String checkIn;
private String checkOut;
private Integer noOfbeds;
private Long roomNo;
private Double totalAmount;
private String bookingStatus;
}
