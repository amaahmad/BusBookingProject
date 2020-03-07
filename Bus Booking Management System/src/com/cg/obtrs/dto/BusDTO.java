package com.cg.obtrs.dto;

import java.util.Date;

public class BusDTO 
{
  private Integer BusId; 
  private String sourceStation;
  private String destinationStation;
  private String busType;
  private static Integer totalSeats;
  private Float fare;
  private String SeatNo;
  
  
public BusDTO(String sourceStation, String destinationStation, String busType,
		Float fare, String seatNo) {
	super();
	
	this.sourceStation = sourceStation;
	this.destinationStation = destinationStation;
	this.busType = busType;
	this.fare = fare;
	this.SeatNo = seatNo;
	
}
public BusDTO()
{
	super();
}
public Integer getBusId() {
	return BusId;
}
public void setBusId(Integer busId) {
	BusId = busId;
}
public String getSourceStation() {
	return sourceStation;
}
public void setSourceStation(String sourceStation) {
	this.sourceStation = sourceStation;
}
public String getDestinationStation() {
	return destinationStation;
}
public void setDestinationStation(String destinationStation) {
	this.destinationStation = destinationStation;
}
public String getBusType() {
	return busType;
}
public void setBusType(String busType) {
	this.busType = busType;
}
public static Integer getTotalSeats() {
	return totalSeats;
}
public Float getFare() {
	return fare;
}
public void setFare(Float fare) {
	this.fare = fare;
}
public String getSeatNo() {
	return SeatNo;
}
public void setSeatNo(String seatNo) {
	SeatNo = seatNo;
}  

}
