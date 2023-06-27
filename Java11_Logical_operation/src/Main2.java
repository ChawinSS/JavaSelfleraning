import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		
		// logical operators = used to connect two or more expressions
		//
		//						&& = (AND) both conditions must be true
		// 						|| = (OR) either condition must be true
		//						! = (NOT) reverses boolean value of condition

		Scanner scanner = new Scanner(System.in);
		String response;
		
		System.out.println("You are streaming a porn! Press q or Q to quit");
		response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are fabing");
		}
		else {
			System.out.println("Good day, well play");
		}
	}
}
