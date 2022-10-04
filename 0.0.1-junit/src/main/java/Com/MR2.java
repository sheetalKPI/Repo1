package Com;

public class MR2 {
     public static void ThreadStstus() {
    	 System.out.println("Thread is running...");
     }
     public static void main(String[] args) {
		Thread t2=new Thread(MR2::ThreadStstus);
		t2.start();

	}

}
