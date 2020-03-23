package com.DAO;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;

import com.DTO.Airport;
import com.DTO.Flight;
import com.DTO.Schedule;
import com.DTO.ScheduledFlight;
import com.Service.AirportService;
import com.Service.Validation;
import com.util.AirportUtil;
import com.util.FlightUtil;
import com.util.ScheduleUtil;
import com.util.ScheduledFlightUtil;

public class ScheduledFlightDaoImpl  implements ScheduledFlightInterface{
	static ScheduledFlightUtil sfu=new ScheduledFlightUtil();

    Scanner s=new Scanner(System.in);
	public static ScheduleUtil su=new ScheduleUtil();
	static Flight f=new Flight();
	static FlightUtil fu=new FlightUtil();
	static AirportUtil au=new AirportUtil();
	static AirportService as=new AirportService();
	ScheduledFlight sf=new ScheduledFlight();
	//ScheduledFlightUtil sfu=new ScheduledFlightUtil();
	
		//scheduling a flight 
		public ScheduledFlight scheduleFlight(ScheduledFlight sf)
		{
			LocalDateTime arrivalDatetime,departureDateTime;
			String sourceAirportLocationCode,destinationAirportLocationCode;
			int availableSeatCapacity;
			int year,month,day,hour,min,sec;
			int flightNumber;
			System.out.println("from the following list enter airport location code");
			System.out.println(as.viewAirport());
			
			System.out.println("enter flight number");
			flightNumber=s.nextInt();
			System.out.println("enter flight model:");
			String flightModel=s.next();
			System.out.println("enter carrier name:");
			String carrierName=s.next();
			System.out.println("enter Seat Capacity");
			int seatCapacity=s.nextInt();
			
			//for source
			System.out.println("enter source airport code");
			sourceAirportLocationCode=s.next();
			//for arrival
			System.out.println("enter arrival date and time one by one ");
			System.out.println("Year:");
			year=s.nextInt();
			System.out.println("month:");
			month=s.nextInt();
			System.out.println("day");
			day=s.nextInt();
			
			System.out.println(" hour:");
			hour=s.nextInt();
			System.out.println("minute:");
			min=s.nextInt();
			System.out.println("seconds:");
			sec=s.nextInt();
			
			arrivalDatetime=LocalDateTime.of(year,month,day,hour,min,sec);
			
			int i=0;
			//for destination
			destinationAirportLocationCode=null;
			while(i<3)
			{
			System.out.println("enter destination airport code");
			destinationAirportLocationCode=s.next();
			
			boolean c=Validation.valid(destinationAirportLocationCode,Validation.pattern);
			if(c==true)
			{
				System.out.println("correct");break;
			}
			else
			{
				i++;
				System.out.println("wrong \nenter again");
				
				if(i==3 && c==false)
					System.exit(0);
			}
			
			}
			//for departure
			System.out.println("enter departure date and time one by one ");
			System.out.println("Year:");
			year=s.nextInt();
			System.out.println("month:");
			month=s.nextInt();
			System.out.println("day");
			day=s.nextInt();
			
			System.out.println(" hour:");
			hour=s.nextInt();
			System.out.println("minute:");
			min=s.nextInt();
			System.out.println("seconds:");
			sec=s.nextInt();
			
			departureDateTime=LocalDateTime.of(year,month,day,hour,min,sec);
			//seat capacity
			System.out.println("enter available Seat Capacity");
			availableSeatCapacity=s.nextInt();
			
			//airport location
			
			
			
			sfu.scheduleFlightmap.put(flightNumber, new ScheduledFlight(new Flight(flightNumber,flightModel,carrierName,seatCapacity),availableSeatCapacity,new Schedule(au.getAirport(sourceAirportLocationCode),au.getAirport(destinationAirportLocationCode),arrivalDatetime,departureDateTime)));
			
			
			
			
			return null;

			
		}
		//filtering scheduled flights based on from and to airports and the date of travelling
		public ScheduledFlight viewScheduledFlights(Airport from,Airport to,LocalDateTime date)
		{
			if(sfu.scheduleFlightmap.get(sfu).getSchedule().getArrivalDateTime().isEqual(date))
			{
				if(sfu.scheduleFlightmap.get(sfu).getSchedule().getSourceAirport().equals(from) && sfu.scheduleFlightmap.get(sfu).getSchedule().getDestinationAirport().equals(to))
				{
					return (ScheduledFlight) sfu.scheduleFlightmap;
				}
			}
			return null;
			
		}

		//viewing scheduled details of specific flight
		public ScheduledFlight viewScheduledFlights(int flightNumber)
		{
			return sfu.scheduleFlightmap.get(flightNumber);
		}
		
		//viewing all scheduled flight
		public Map viewScheduledFlights()
		{
			return sfu.scheduleFlightmap;
		}
		
		
		public ScheduledFlight modifyScheduledFlight(Flight f,Schedule sc,int flightNumber)
		{

			LocalDateTime arrivalDatetime,departureDateTime;
			String sourceAirportLocationCode,destinationAirportLocationCode;
			int availableSeatCapacity;
			int year,month,day,hour,min,sec;
		
			//airport location
			System.out.println("from the following list enter airport location code");
			System.out.println(as.viewAirport());
			
		
			System.out.println("enter flight model:");
			String flightModel=s.next();
			System.out.println("enter carrier name:");
			String carrierName=s.next();
			System.out.println("enter Seat Capacity");
			int seatCapacity=s.nextInt();
			
			
			//for source
			System.out.println("enter source airport code");
			sourceAirportLocationCode=s.next();
			//for arrival
			System.out.println("enter arrival date and time one by one ");
			System.out.println("Year:");
			year=s.nextInt();
			System.out.println("month:");
			month=s.nextInt();
			System.out.println("day");
			day=s.nextInt();
			
			System.out.println(" hour:");
			hour=s.nextInt();
			System.out.println("minute:");
			min=s.nextInt();
			System.out.println("seconds:");
			sec=s.nextInt();
			
			arrivalDatetime=LocalDateTime.of(year,month,day,hour,min,sec);
			
			
			//for destination
			
			System.out.println("enter destination airport code");
			destinationAirportLocationCode=s.next();
			
			
			//for departure
			System.out.println("enter departure date and time one by one ");
			System.out.println("Year:");
			year=s.nextInt();
			System.out.println("month:");
			month=s.nextInt();
			System.out.println("day");
			day=s.nextInt();
			
			System.out.println(" hour:");
			hour=s.nextInt();
			System.out.println("minute:");
			min=s.nextInt();
			System.out.println("seconds:");
			sec=s.nextInt();
			
			departureDateTime=LocalDateTime.of(year,month,day,hour,min,sec);
			//seat capacity
			System.out.println("enter available Seat Capacity");
			availableSeatCapacity=s.nextInt();
			
			
			
			
			//modification is done here
			
			if(sfu.scheduleFlightmap.containsKey(flightNumber)==true)
			{
				sfu.scheduleFlightmap.replace(flightNumber, new ScheduledFlight(new Flight(flightNumber,flightModel,carrierName,seatCapacity),availableSeatCapacity,new Schedule(au.getAirport(sourceAirportLocationCode),au.getAirport(destinationAirportLocationCode),arrivalDatetime,departureDateTime)));//111
				
			}
			return null;
			
		}
		
		public void deleteScheduledFlight(int flightNumber)
		{
			 sfu.scheduleFlightmap.remove(flightNumber);
		}
		
}
