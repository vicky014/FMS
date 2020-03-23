package com.testing.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.DAO.ScheduledFlightDaoImpl;
import com.DTO.Airport;
import com.DTO.Flight;
import com.DTO.Schedule;
import com.DTO.ScheduledFlight;
import com.util.ScheduledFlightUtil;

class ScheduledFlightTest {

	ScheduledFlightDaoImpl sfd=new ScheduledFlightDaoImpl();
	ScheduledFlight sf=new ScheduledFlight();
	ScheduledFlightUtil sfu=new ScheduledFlightUtil();
	Flight f=new Flight();
	Schedule sc=new Schedule();
	@Test
	void test1() {//scheduling flight
		
		assertEquals(sfu.scheduleFlightmap.get(sfu.scheduleFlightmap.size()-1), sfd.scheduleFlight(sf));
	}
	
	@Test
	void test2() {//view scheduled flight
		Airport from=new Airport();
		Airport to=new Airport();
		LocalDateTime date = LocalDateTime.of(2020, 12, 31, 12, 50,25);
		assertTrue(sfd.viewScheduledFlights(from, to, date));
		
	}
	
	@Test
	void test3() {
		int flightNumber=100;
		assertTrue(sfd.viewScheduledFlights(flightNumber));
	}
	
	@Test
	void test4() {
		
		assertTrue(sfd.viewScheduledFlights());
	}

	@Test
	void test5() {
		int flightNumber=100;
		assertTrue(sfd.modifyScheduledFlight(f, sc, flightNumber));
	}
	
	@Test
	void test6() {
		int flightNumber=102;
		boolean b=sfu.scheduleFlightmap.containsKey(flightNumber);
		sfd.deleteScheduledFlight(flightNumber);
		assertEquals(b, sfu.scheduleFlightmap.containsKey(flightNumber));
	}
	private void assertTrue(Map viewScheduledFlights) {
		// TODO Auto-generated method stub
		
	}

	private void assertTrue(ScheduledFlight viewScheduledFlights) {
		// TODO Auto-generated method stub
		
	}
	
}
