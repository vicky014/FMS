package com.util;

import java.util.HashMap;
import java.util.Map;

import com.DTO.Flight;

public class FlightUtil {
	
	public static Map<Integer,Flight> mapFlight=new HashMap<Integer,Flight>();
	static {
		
		mapFlight.put(100,new Flight(100, "A1", "AirIndia", 100) );
		mapFlight.put(101,new Flight(101, "B2", "Indigo", 150) );
		mapFlight.put(102,new Flight(102, "C3", "JetAirways", 80) );
		mapFlight.put(103,new Flight(103, "D4", "SpiceJet", 90) );
	
		
	}

}
