package com.Service;

import java.time.LocalDateTime;

import java.util.Map;

import com.DAO.ScheduledFlightDaoImpl;
import com.DTO.Airport;
import com.DTO.Flight;
import com.DTO.Schedule;
import com.DTO.ScheduledFlight;
import com.util.AirportUtil;
import com.util.FlightUtil;
import com.util.ScheduleUtil;
import com.util.ScheduledFlightUtil;



public class ScheduledFlightServcieImpl  implements ScheduledFlightServiceInterface{

static ScheduledFlightUtil s=new ScheduledFlightUtil();
static ScheduledFlightDaoImpl sfd=new ScheduledFlightDaoImpl();


public static ScheduleUtil su=new ScheduleUtil();
static Flight f=new Flight();
static FlightUtil fu=new FlightUtil();
static AirportUtil au=new AirportUtil();
ScheduledFlight sf=new ScheduledFlight();
	
	public ScheduledFlight scheduleFlight(ScheduledFlight sf)
	{
		
		
		return sfd.scheduleFlight(sf);
		
	}
	public ScheduledFlight viewScheduledFlights(Airport from,Airport to,LocalDateTime date)
	{
		
		
		return sfd.viewScheduledFlights(from, to, date);
		
	}
	
	public ScheduledFlight viewScheduledFlights(int flightNumber)
	{
		return sfd.viewScheduledFlights(flightNumber);
	}
	public Map viewScheduledFlights()
	{
		return sfd.viewScheduledFlights();
	}
	
	public ScheduledFlight modifyScheduledFlight(Flight f,Schedule s,int flightNumber)
	{
		
		return sfd.modifyScheduledFlight(f, s, flightNumber);
		
	}
	
	public void deleteScheduledFlight(int flightNumber)
	{
		 sfd.deleteScheduledFlight(flightNumber);
	}
	
	
	
	
}
