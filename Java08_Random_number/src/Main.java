import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1;
		double y = random.nextDouble(5)+1; //start from 1 but not more than 6 with decimal
		boolean z = random.nextBoolean();
		
		System.out.println("Dicing result: "+ x);
		System.out.printf("Random decimal: %.2f\n",y);
		System.out.println("T/F: "+ z);
				
	}
}