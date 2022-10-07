package Com;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable 
{

	@Override
	public void run() {
		
		try {
			Long duration =(long) (Math.random() *5);//hard coding the time= 5 mins
			System.out.println("Runnable Task");
			TimeUnit.SECONDS.sleep(duration);//halting the thread: every thread will execute after an interval of 5 min			
			//t1... 5mins... t2... 5mins... :sleep : takes one and only one argument : duration
			System.out.println("Task Completed");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
