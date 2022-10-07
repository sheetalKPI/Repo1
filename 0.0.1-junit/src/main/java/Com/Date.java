package Com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {

	 public static void LocalDateTimeApi()
	 {
		 LocalDate date = LocalDate.now();
		 System.out.println("the current date is "+ date);
		  
		 LocalTime time = LocalTime.now();
		 System.out.println("the current time is "+ time);
		 
		 LocalDateTime current = LocalDateTime.now();
		 System.out.println("the current date and time is "+ current);
		  
		 DateTimeFormatter format = 
				 DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		 System.out.println("the current date is "+ date);
		  
	String formatedDateTime = current.format(format);
	System.out.println("in formmated manner "+ formatedDateTime );
	
	Month month = current.getMonth();
	int day = current.getDayOfMonth();
	int seconds = current.getSecond();
	int hour = current.getHour();
	int year = current.getYear();
	System.out.println("Month :"+month+" day : "+day+
			" seconds : "+seconds+" hour :"+hour+" year :"+ year);
	
	LocalDate date2 = LocalDate.of(2022, 01, 26);
	System.out.println("my birthday :"+date2);
	
	LocalDateTime specificDate =
			current.withDayOfMonth(19).withYear(2010);
	System.out.println("specific date with "+
			"current time : "+specificDate);
	
	 }
	 public static void main(String[] args)
	 {
		 LocalDateTimeApi();
	 }
}
