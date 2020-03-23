package com.util;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.DTO.Airport;
import com.DTO.Flight;
import com.DTO.Schedule;
import com.DTO.ScheduledFlight;
import com.Service.AirportService;

public class ScheduleUtil {
	static Flight f=new Flight();
	ScheduledFlight sf=new ScheduledFlight();
	static Schedule s=new Schedule();
	static Airport a=new Airport();
	AirportUtil au=new AirportUtil();
	static AirportService as=new AirportService();
	
	
	public static Map<Integer,Schedule> scheduleUtilMap=new HashMap<Integer,Schedule>();
	static {
		scheduleUtilMap.put(100,new Schedule(as.viewAirport("2000"), as.viewAirport("2001"), LocalDateTime.of(2020,2,2,10,10,10), LocalDateTime.of(2020,3,3,11,11,11)));
		scheduleUtilMap.put(101,new Schedule(as.viewAirport("2001"), as.viewAirport("2002"), LocalDateTime.of(2020,2,2,10,10,10), LocalDateTime.of(2020,3,3,11,11,11)));
		scheduleUtilMap.put(102,new Schedule(as.viewAirport("2002"), as.viewAirport("2003"), LocalDateTime.of(2020,2,2,10,10,10), LocalDateTime.of(2020,3,3,11,11,11)));
		scheduleUtilMap.put(103,new Schedule(as.viewAirport("2003"), as.viewAirport("2001"), LocalDateTime.of(2020,2,2,10,10,10), LocalDateTime.of(2020,3,3,11,11,11)));
	}
	

}
