package com.DTO;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class Schedule {
	
	private Airport sourceAirport;
	private Airport destinationAirport;
	private LocalDateTime arrivalDateTime;
	private LocalDateTime departureDateTime;
	
	
	public Schedule()
	{
		
	}
	
	


	public Schedule(Airport sourceAirport, Airport destinationAirport, LocalDateTime arrivalDateTime,
			LocalDateTime departureDateTime) {
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalDateTime = arrivalDateTime;
		this.departureDateTime = departureDateTime;
	}




	public Airport getSourceAirport() {
		return sourceAirport;
	}


	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}




	public Airport getDestinationAirport() {
		return destinationAirport;
	}


	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}


	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}


	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}


	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}


	public void setDepartureDateTime(LocalDateTime departureDate) {
		this.departureDateTime = departureDate;
	}




	@Override
	public String toString() {
		return "Schedule [sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport
				+ ", arrivalDateTime=" + arrivalDateTime + ", departureDateTime=" + departureDateTime + "]\n";
	}




	
	
	
	
	
	

}
