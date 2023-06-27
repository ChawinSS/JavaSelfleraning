import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
			ArrayList<String> bakeryList = new ArrayList();
				bakeryList.add("pasta");
				bakeryList.add("garlic bread");
				bakeryList.add("donuts");
			
			ArrayList<String> produceList = new ArrayList();
				produceList.add("tomatoes");
				produceList.add("zucchini");
				produceList.add("peppers");
			
			ArrayList<String> drinksList = new ArrayList();
				drinksList.add("soda");
				drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);

		System.out.println("\nLoop through whole shopping list:");
		for(int i=0; i<groceryList.size(); i++) {
			System.out.println("-"+groceryList.get(i));
		}

		System.out.println("\nLoop through drink list:");
		for(int i=0; i<drinksList.size(); i++) {
			System.out.println("-"+drinksList.get(i));
		}
		
		System.out.println();
		}
}