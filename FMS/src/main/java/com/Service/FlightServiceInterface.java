package com.Service;

import java.util.Map;

import com.DTO.Flight;

public interface FlightServiceInterface {
	Flight addFlight(Flight f);
	Flight modifyFlight(Flight f);
	Flight viewFlight(int flightNumber);
	Map viewFlight();
	void deleteFlight(int flightNumber);
}
