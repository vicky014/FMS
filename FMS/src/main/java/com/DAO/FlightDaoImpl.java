package com.DAO;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.DTO.*;
import com.util.FlightUtil;

public class FlightDaoImpl implements FlightInterface {
	
	FlightUtil fu=new FlightUtil();
	

	//adding new flight 
	public Flight addFlight(Flight f)
	{
		
		int flightNumber;
		String flightmodel;
		String carrierName;
		int seatCapacity;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter Flight number");
		flightNumber=s.nextInt();
		System.out.println("enter Flight model");
		flightmodel=s.next();
		System.out.println("enter Carrier Name");
		carrierName=s.next();
		System.out.println("enter Seat Capacity");
		seatCapacity=s.nextInt();
		fu.mapFlight.put(flightNumber, new Flight(flightNumber,flightmodel,carrierName,seatCapacity));
//		System.out.println("All flights");
//		System.out.println(fu.mapFlight);
		return f;
		
	}
	
	//modifying flight details of a specific flight 
	public Flight modifyFlight(Flight f)
	{
		//validating flight number
		int flightNumber;
		String flightmodel;
		String carrierName;
		int seatCapacity;
		Scanner s=new Scanner(System.in);
		System.out.println("enter Flight number");
		flightNumber=s.nextInt();
		System.out.println("enter Flight model");
		flightmodel=s.next();
		System.out.println("enter Carrier Name");
		carrierName=s.next();
		System.out.println("enter Seat Capacity");
		seatCapacity=s.nextInt();
		if(fu.mapFlight.containsKey(flightNumber)==true)
		{
			fu.mapFlight.replace(flightNumber, new Flight(flightNumber,flightmodel,carrierName,seatCapacity));
		}
		
		return f;
		
	}
	
	
	//viewing flight details of a specific details
	public Flight viewFlight(int flightNumber)
	{
		
		return fu.mapFlight.get(flightNumber);
	}
	
	
	//viewing all flight details
	public Map viewFlight()
	{
		return fu.mapFlight;
		
	}
	
	//deleting flight details of a specific flight
	public void deleteFlight(int flightNumber)
	{
		fu.mapFlight.remove(flightNumber);
		System.out.println(fu.mapFlight);
	}
	
	

	
	
	
}
