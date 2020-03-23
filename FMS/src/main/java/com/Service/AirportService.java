package com.Service;

import java.util.Map;

import com.DAO.AirportDao;
import com.DTO.Airport;

public class AirportService  implements AirportServiceInterface{

		AirportDao ad=new AirportDao();
		
		public Airport viewAirport(String id)
		{
			return ad.viewAirport(id);
		}
		
		public Map viewAirport()
		{
			return ad.viewAirport();
		}
}
