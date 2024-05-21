package javadateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println("Current Date is: " + date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Current Time is: " + time);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Current Date and Time is: " + dt);
		
		DateTimeFormatter format = 
				DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDateTime = dt.format(format);
		
		System.out.println("In Format :  " + formattedDateTime );
		
		Month month = dt.getMonth();
		int day = dt.getDayOfMonth();
		int seconds = dt.getSecond();
		
		System.out.println("Month: " + month + " " + "Day: " + day + " " + "Seconds: " + seconds );
		
		LocalDate dt2 = LocalDate.of(1988,01,22);
		System.out.println("Day : "  + dt2);
		
		LocalDateTime specificDate = dt.withDayOfMonth(24).withYear(2022);
		System.out.println("Specific date with current time: " + specificDate);
		
	}

}
