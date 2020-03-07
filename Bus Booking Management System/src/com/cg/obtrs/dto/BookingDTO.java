package com.cg.obtrs.dto;

import java.util.Date;

public class BookingDTO 
{
  private static Integer bookingId=10001;
  private Date boardingTime;
  private Date dropTime;
  private Integer seatsBooked;
private Integer distanceInKms;
public BookingDTO(Date boardingTime, Date dropTime, Integer seatsBooked, Integer distanceInKms) {
	super();
	this.boardingTime = boardingTime;
	this.dropTime = dropTime;
	this.seatsBooked = seatsBooked;
	this.distanceInKms=distanceInKms;
}
public Integer getDistanceInKms() {
	return distanceInKms;
}
public void setDistanceInKms(Integer distanceInKms) {
	this.distanceInKms = distanceInKms;
}
public static Integer getBookingId() {
	return bookingId;
}
public static void setBookingId(Integer bookingId) {
	BookingDTO.bookingId = bookingId;
}
public Date getBoardingTime() {
	return boardingTime;
}
public void setBoardingTime(Date boardingTime) {
	this.boardingTime = boardingTime;
}
public Date getDropTime() {
	return dropTime;
}
public void setDropTime(Date dropTime) {
	this.dropTime = dropTime;
}
public Integer getSeatsBooked() {
	return seatsBooked;
}
public void setSeatsBooked(Integer seatsBooked) {
	this.seatsBooked = seatsBooked;
}
  
}
