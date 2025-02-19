package BusReser;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class BusDemo {
	public static void main(String[] args) {
		//Bus buses[] = new Bus[50];ArrayList  collection
		//Bus bus2 = new Bus();
		// array oda arraylist better ,array list la size i.e., ithana data than adda pana porom apdinu sollanum nu avasiyam illa we can add n number of data
		ArrayList<Bus> buses = new ArrayList<Bus>(); //busses kulla niraya BUS object create panlam
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,true,45));
		buses.add(new Bus(3,true,45));
		buses.add(new Bus(4,true,45));
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfor();
		}
		
		while(userOpt==1) {
		
		System.out.println("Enter 1 to book and 2 to exit");
		userOpt = scanner.nextInt();
		if (userOpt==1) {
			Booking booking = new Booking();
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Your booking is confirmned");
			}
			else
				System.out.println("Sorry. Bus is full .try another bus or date.");
		}
		}
	}
}
