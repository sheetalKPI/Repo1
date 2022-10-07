package Com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ques2 {
	public static void checkingChronoEnum()
	{
		LocalDate date = LocalDate.now();
		System.out.println("current date is :" +date);
		
		LocalDate year = date.plus(8, ChronoUnit.YEARS);
		System.out.println("Date on : "+year);
	
	}
	public static void main(String[] args) {
		
      checkingChronoEnum();
	}

}
