package Com;

import java.util.ArrayList;
import java.util.List;

interface TestForEach1{
	void print(List test);
}
public class ForEach1 {

	public static void main(String[] args) {
	List<String> fruitList = new ArrayList<String>();
    fruitList.add("Apple");
    fruitList.add("Orange");
    fruitList.add("Mango");
    fruitList.add("Grapes");
    fruitList.add("Pineapple");
    fruitList.add("Kiwi");
    
    for(int i=0;i<fruitList.size();i++) {
    	System.out.println(fruitList.get(i));
    }
    System.out.println("----------------Iterating by passing lambda expression------");
    fruitList.forEach(fruit -> System.out.println(fruit));
    TestForEach tfe=fruit -> System.out.println(fruit);
}
	}


