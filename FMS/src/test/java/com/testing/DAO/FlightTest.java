package com.testing.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import com.DAO.FlightDaoImpl;
import com.DTO.Flight;
import com.util.FlightUtil;

class FlightTest {

	FlightDaoImpl fd=new FlightDaoImpl();
	Flight f=new Flight();
	FlightUtil fu=new FlightUtil();
	@Test
	void test1() {
		
		
		//addFLight
		
		assertEquals(fu.mapFlight.get(fu.mapFlight.size()-1), fd.addFlight(f));
		
		
	}
	
	@Test
	void test2()
	{//modify Flight
		assertTrue(fd.modifyFlight(f));
	}
	
	private void assertTrue(Flight modifyFlight) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void test3()
	{
		int flightNumber=101;
		assertTrue(fd.viewFlight(flightNumber));
		
	}
	@Test
	void test4()
	{
		assertTrue(fd.viewFlight());
		
	}
	private void assertTrue(Map viewFlight) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void test5()
	{
		int flightNumber=102;
		boolean b=fu.mapFlight.containsKey(flightNumber);
		fd.deleteFlight(flightNumber);
		assertEquals(b, fu.mapFlight.containsKey(flightNumber));
	}

	
	

}
