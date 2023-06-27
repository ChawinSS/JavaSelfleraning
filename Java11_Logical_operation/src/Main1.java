public class Main1 {

	public static void main(String[] args) {
		
		// logical operators = used to connect two or more expressions
		//
		//						&& = (AND) both conditions must be true
		// 						|| = (OR) either condition must be true
		//						! = (NOT) reverses boolean value of condition

		int temp = 25;
		
			if(temp>30) {
				System.out.println("Hot outside");
			}
				else if(temp<=30 && temp>=20) {
					System.out.println("Warm outside");
				}
					else {
						System.out.println("Cold outside");
					}
	}
}
