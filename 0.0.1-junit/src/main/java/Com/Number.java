package Com;

import java.util.ArrayList;
import java.util.List;

interface RealNumber{
	void print(List test);
}
public class Number {

	public static void main(String[] args) {
	ArrayList<Integer> Numbers = new ArrayList<Integer>();
	
	Numbers.add(24);
	Numbers.add(38);
	Numbers.add(46);
	Numbers.add(52);
	
	Numbers.forEach((n) -> System.out.println(n));
	}

}
