package com.Service;

import java.util.Map;

import com.DAO.FlightDaoImpl;
import com.DTO.Flight;

public class FlightServiceImpl implements FlightServiceInterface{

	
	 FlightDaoImpl fd=new FlightDaoImpl();
	
	public Flight addFlight(Flight f)
	{
		return fd.addFlight(f);
	}
	
	public Flight modifyFlight(Flight f)
	{
		return fd.modifyFlight(f);
		
	}
	public Flight viewFlight(int flightNumber)
	{
		return fd.viewFlight(flightNumber);
	}
	public Map viewFlight()
	{
		return fd.viewFlight();
	}
	public void deleteFlight(int flightNumber)
	{
		 fd.deleteFlight(flightNumber);
	}
	
	
	
}
