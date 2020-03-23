package com.DAO;

import java.util.*;

import com.DTO.Airport;
import com.util.AirportUtil;

public class AirportDao  implements AirportInterface{
	
	static AirportUtil au=new AirportUtil();
	
	//viewing airport details with a specific airport code
	public Airport viewAirport(String airportCode)
	{
		return au.getAirport( airportCode);
	}
	
	//viewing airport details of all airports
	public Map viewAirport()
	{
		return au.airportMap;
	}
	

	
}
