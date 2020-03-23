package com.testing.DAO;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import com.DAO.AirportDao;
import com.DAO.FlightDaoImpl;
import com.DAO.ScheduledFlightDaoImpl;


class AirportTest {
	AirportDao ad=new AirportDao();
	
	
	@Test
	void test() {
		assertTrue(ad.viewAirport());
		assertTrue(ad.viewAirport("2000"));
		
	}
	
	

	private void assertTrue(com.DTO.Airport viewAirport) {
		// TODO Auto-generated method stub
		
	}



	private void assertTrue(Map viewAirport) {
		// TODO Auto-generated method stub
		
	}



	



	



	

	
}
