package com.DAO;

import java.time.LocalDateTime;
import java.util.Map;

import com.DTO.Airport;
import com.DTO.Flight;
import com.DTO.Schedule;
import com.DTO.ScheduledFlight;

public interface ScheduledFlightInterface {

	ScheduledFlight scheduleFlight(ScheduledFlight sf);
	 ScheduledFlight viewScheduledFlights(Airport from,Airport to,LocalDateTime date);
	 ScheduledFlight viewScheduledFlights(int flightNumber);
	 Map viewScheduledFlights();
	 ScheduledFlight modifyScheduledFlight(Flight f,Schedule sc,int flightNumber);
	 void deleteScheduledFlight(int flightNumber);
}
