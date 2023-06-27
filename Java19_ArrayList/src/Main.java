import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		// ArrayList = 	a resizable array. 
		//				Elements can be added and removed after compilation phase
		//				store reference data types
		
		ArrayList<String> food = new ArrayList();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		//food.set(0, "sushi");
		//food.remove(2);
		//food.clear();
		
		System.out.println(food+"\n");		
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}