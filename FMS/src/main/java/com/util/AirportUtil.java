package com.util;

import java.util.*;

import com.DTO.*;

public class AirportUtil {
	
	Airport a=new Airport();
	static Flight f=new Flight();
	
	public static Map<String,Airport> airportMap=new HashMap<String,Airport>();
	static {
		airportMap.put("2000", new Airport("IGIairport","2000","Old Delhi"));
		airportMap.put("2001", new Airport("GIGairport","2001","New Delhi"));
		airportMap.put("2002", new Airport("Dehradunairport","2002","Deharadun"));
		airportMap.put("2003", new Airport("Vizagairport","2003","Andhra Pradesh"));
		airportMap.put("2004", new Airport("IGairport","2001"," Dubai"));
		airportMap.put("2005", new Airport("Deharairport","2002","Dehar"));
		airportMap.put("2006", new Airport("Veniceairport","2003","Venice"));
	}

	public static Airport getAirport(String airportCode)
	{
		return airportMap.get(airportCode);
	}
}
