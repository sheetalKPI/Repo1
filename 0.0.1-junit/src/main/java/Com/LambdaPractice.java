package Com;

public class LambdaPractice {

		public static void main(String[] args) {
		LambdaPractice tester = new LambdaPractice(); 
		
		mathOperation addition = (int a, int b) -> a+b;
		
		mathOperation subtraction = ( a,  b) -> a-b;
		
		mathOperation multiplication = ( a, b) -> {return a*b;};
		
		mathOperation division = (int a, int b) -> a/b;
		
		System.out.println("2+5="+tester.operate(2,5,addition));
		System.out.println("20-10="+tester.operate(20,10,subtraction));
		System.out.println("2*5="+tester.operate(2,5,multiplication));
		System.out.println("20/5="+tester.operate(20,5,division));
		}

		private int operate(int a, int b, mathOperation  mathOperation) {
			// TODO Auto-generated method stub
			return mathOperation.operation(a, b);

		}

}
