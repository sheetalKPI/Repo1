package Com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

	public static void checkingAdjusters()
	{
		LocalDate date = LocalDate.now();
		System.out.println("current date is :" +date);
		
		LocalDate dayOfNextMonth = 
				date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("first day of next month :"+
				dayOfNextMonth );
		
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("next saturday from now is "+
		nextSaturday);
		
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("firstDayOfMonth : "+
		    firstDay);
		
		LocalDate lastDay = 
				date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("lastDayMonth : "+ 
				lastDay);
	}	
	public static void main(String[] args) {
		checkingAdjusters();
	}
	
}
