package javadateandtimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Test3 {

	static void checkingAdjusters() {
		LocalDate dt = LocalDate.now();
		System.out.println("Current Date is: " + dt);
		
		LocalDate dayOfNextMonth = dt.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("firstDayOfNextMonth : " + dayOfNextMonth);
		
		LocalDate nextFriday = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("Next Friday from now is: " + nextFriday);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkingAdjusters();
	}

}
