package javadateandtimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Test2 {

	static void checkingPeriod(){
		LocalDate dt1 = LocalDate.now();
		LocalDate dt2 = LocalDate.of(2014, Month.MAY,20);
		Period gap = Period.between(dt2, dt1);
		System.out.println("Gap between dates is a period of " + gap);
	}
	
	static void checkDuration() {
		LocalTime t1 = LocalTime.now();
		System.out.println("Current Time is: " + t1);
		
		Duration fiveHrs = Duration.ofHours(5);
		
		LocalTime t2 = t1.plus(fiveHrs);
		System.out.println("After Adding 5 hrs: " + t2);
		
		Duration gap = Duration.between(t2, t1);
		System.out.println("Duration Gap between time1 " + " & time2 is " + gap);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkingPeriod();
		checkDuration();
	}

}
