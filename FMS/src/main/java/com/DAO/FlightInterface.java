package com.DAO;

import java.util.Map;

import com.DTO.Flight;

public interface FlightInterface {

	Flight addFlight(Flight f);
	 Flight modifyFlight(Flight f);
	 Flight viewFlight(int flightNumber);
	 Map viewFlight();
	 void deleteFlight(int flightNumber);
}
