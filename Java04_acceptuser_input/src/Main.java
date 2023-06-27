import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		String food;
		
		System.out.println("Your name?");
			name= scanner.nextLine();
		
		System.out.println("Your age?");
			age= scanner.nextInt();

				scanner.nextLine();
			
		System.out.println("Your favorit foods?");
			food =scanner.nextLine();

			
		System.out.println("Hello " + name + ". You are " + age + ".+ Your favorite food is " + food+".");
	}

}
