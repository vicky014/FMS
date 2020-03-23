package main;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.DTO.Airport;
import com.DTO.Flight;
import com.DTO.Schedule;
import com.DTO.ScheduledFlight;
import com.Service.AirportService;
import com.Service.FlightServiceImpl;
import com.Service.ScheduledFlightServcieImpl;
import com.util.AirportUtil;
import com.util.FlightUtil;

public class Main {
	public static void main(String[] args) 
	{//main starts
		Scanner s=new Scanner(System.in);
		
		//all objects are created here
		Flight f=new Flight();
		FlightUtil fu=new FlightUtil();
		FlightServiceImpl fs=new FlightServiceImpl();
		
		AirportService as=new AirportService();
		AirportUtil au=new AirportUtil();
		
		Schedule sc=new Schedule();
		ScheduledFlight sf=new ScheduledFlight();
		ScheduledFlightServcieImpl sfs=new ScheduledFlightServcieImpl();	
	
		
		while(true)
		{System.out.println("----------------Welcome----------------");
		 System.out.println("Press the following:\n1.Flight\n2.Scheduled Flight\n3.exit");
		 System.out.println("enter your choice");
		
		 int ch=s.nextInt();
			switch(ch)
			{
			case 1://all flight operations
					{
						System.out.println("---------------Menu---------------");
						System.out.println("1.add Flight\n2.modify Flight\n3.to view a specific Flight\n4.to view all Flights\n5.delete Flight\n6.exit");
						System.out.println("enter your choice");
						int choice=s.nextInt();
						try {
							ChoiceFlight.choice(choice);
						} catch (ExceptionHandling e) {
							
							System.out.println(e.getMessage());
						}
						
						switch(choice)
						{
						case 1:{//adding flight
								fs.addFlight(f);
							
								}break;	
						case 2:{//modifying flight details based on flight number
								fs.modifyFlight(f);
								}break;
						case 3:{//viewing a specific flight number
								System.out.println("enter Flight number you want to search");
								int flightNumber=s.nextInt();
								System.out.println(fs.viewFlight(flightNumber));
							
								}break;
						case 4:{//viewing all flights
								System.out.println("all Flights");
								System.out.println(fs.viewFlight());
								}break;
						case 5:{//deleting a specific flight based on it flight number
								System.out.println("enter the flight number you want to delete");
								int flightNumber=s.nextInt();
								fs.deleteFlight(flightNumber);
								}break;
						case 6:{
								System.exit(0);
								}break;
						}
				
					}break;
			case 2://all scheduled flight operations
					{
						System.out.println("---------------Menu---------------");
						System.out.println("1.to schedule a Flight\n2.to view Scheduled Flight by filtering by airports and date and time\n3.to view a specific Scheduled Flight\n4.to view all Scheduled Flights\n5.modify a Scheduled Flight\n6.to delete a Scheduled Flight\n7.exit");
						System.out.println("enter your choice");
						int choice=s.nextInt();
						try {
							ChoiceScheduledFlight.choice(choice);
						} catch (ExceptionHandling e) {
							System.out.println(e.getMessage());
						}
						
						switch(choice)
						{
						case 1:
							
								{sfs.scheduleFlight(sf);}break;
							
						case 2:
								{
								System.out.println(au.airportMap);
								System.out.println("enter Airport code of Source Airport");
								String srcAirport=s.next();
								System.out.println("enter Airport Code of Destination Airport");
								String destAirport=s.next();
								System.out.println("enter Date and time  one by one when required");
								int year,month,day,hour,min,sec;
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
	
								LocalDateTime date=LocalDateTime.of(year,month,day,hour,min,sec);
								Airport from=au.airportMap.get(srcAirport);
								Airport to=au.airportMap.get(destAirport);
								sfs.viewScheduledFlights(from, to, date);
								}break;
								
						case 3:
								{System.out.println("enter Scheduled Flight number you want to search");
								int flightNumber=s.nextInt();
								System.out.println(sfs.viewScheduledFlights(flightNumber));
								}break;
							
						case 4:
								{	
								System.out.println(sfs.viewScheduledFlights());
								}break;
						case 5:
								{
								System.out.println("enter Scheduled Flight number you want to modify");
								int flightNumber=s.nextInt();
								sfs.modifyScheduledFlight(f, sc, flightNumber);
								}break;
						case 6:
								{
								System.out.println("enter the Scheduled flight number you want to delete");
								int flightNumber=s.nextInt();
								sfs.deleteScheduledFlight(flightNumber);
								}break;
							
						case 7:{System.exit(0);}
						
						
						}
						
						
				
					}break;//case 2 ends
			case 3://exit
					System.exit(0);
		
		
			}//upper switch
			
			
		}// while	
	}//main ends	
}//class ends
