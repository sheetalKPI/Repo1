package Com;

import java.util.ArrayList;
import java.util.List;

interface TestForEach{
	void print(List test);
}
public class ForEach {

	public static void main(String[] args) {
		List<String> gameList = new ArrayList<String>();
        gameList.add("Football");  //1
        gameList.add("Cricket");  //2
        gameList.add("Chess ");  //3
        gameList.add("Hocky");//4
       
        for(int i=0;i<gameList.size();i++) {
        	System.out.println(gameList.get(i));
        }
        System.out.println("----------------Iterating by passing lambda expression------");
	    gameList.forEach(game -> System.out.println(game));
	    TestForEach tfe=game -> System.out.println(game);
	}

}
