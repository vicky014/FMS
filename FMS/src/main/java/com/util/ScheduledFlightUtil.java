package com.util;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.DTO.*;

public class ScheduledFlightUtil {
	static Flight f=new Flight();
	ScheduledFlight sf=new ScheduledFlight();
	static Schedule s=new Schedule();
	static Airport a=new Airport();
	static AirportUtil au=new AirportUtil();
	public static Map<Integer,ScheduledFlight> scheduleFlightmap=new HashMap<Integer,ScheduledFlight>();
	static {
		scheduleFlightmap.put(100, new ScheduledFlight(new Flight(100, "A1", "AirIndia", 100), 20, new Schedule(au.getAirport("2000"), au.getAirport("2001"), LocalDateTime.of(10, 2,3,8,9,50), LocalDateTime.of(11, 2,4,6,20,40))));
		scheduleFlightmap.put(101, new ScheduledFlight(new Flight(101, "B2", "Indigo", 150), 25, new Schedule(au.getAirport("2001"), au.getAirport("2003"), LocalDateTime.of(2020, 2,2,2,2,2), LocalDateTime.of(2020, 3,3,3,3,3))));
	}


}
