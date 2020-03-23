package com.DTO;

public class Airport {
	
	private String airportName;
	private String airportCode;
	private String airportLocation;
	public String sourceAirport;
	public String destinationAirport; 
	
	
	public Airport()
	{
		
	}
	
	public Airport(String airportName, String airportCode, String airportLocation) {
		super();
		this.airportName = airportName;
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportLocation() {
		return airportLocation;
	}

	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}

	@Override
	public String toString() {
		return "Airport [airportName=" + airportName + ", airportCode=" + airportCode + ", airportLocation="
				+ airportLocation + "]\n";
	}
	
	

}
