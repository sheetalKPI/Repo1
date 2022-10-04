package Com;


public interface MathOperation {
   int  operation(int a, int b);
   }

public class LambdaPractice {

	public static void main(String[] args, MathOperation substraction, MathOperation multiplition) {
	LambdaPractice tester = new LambdaPractice();
	
	MathOperation addition = (int a, int b) -> a+b;
	
	MathOperation subtraction = ( a,  b) -> a-b;
	
	MathOperation multiplication = ( a, b) -> {return a*b;};
	
	MathOperation division = (int a, int b) -> a/b;
	
	System.out.println("2+5"+tester.operate(2,5,addition));
	System.out.println("20-10"+tester.operate(20,10,substraction));
	System.out.println("2*5"+tester.operate(2,5,multiplition));
	System.out.println("20/5"+tester.operate(20,5,division));
	}

	private String operate(int i, int j, MathOperation addition) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


