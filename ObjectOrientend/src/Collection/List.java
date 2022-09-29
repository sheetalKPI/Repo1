package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
     list.add("a");
     list.add("b");
     list.add("b");
     list.add("c");
     list.add("c");
     list.add("c");
       
     Set<String> set=new HashSet<String>();
     Set set2=new HashSet();
     set.add("a");
     set.add("b");
     
     set2.add(1);
     System.out.println(set+""+set2);
     System.out.println(list);
     
     Map<String,Integer> 
     hm = new HashMap<String,Integer>();
   
     hm.put("a", 100);//put a value with respect to a key
     hm.put("b", 200);//if keys are null(missing) or duplicate: values will be orphan
     hm.put("c", 300);
     hm.put("d", 400);
     hm.put("e", 100);
     hm.put("a", 200);
     hm.get("a");//get method helps to get the value from a key
     System.out.println(hm);
     
	}
}
