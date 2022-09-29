package Collection;

public class Exception {

	public static void main(String[] args)
{
		try
		{
            int num = 100/0;
            System.out.println("Divide by zero"+num);
            }
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
		System.out.println("Continue Rest Code");
		}
}
}