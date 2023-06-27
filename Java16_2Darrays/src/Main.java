public class Main {

	public static void main(String[] args) {
			
		// 2D array = an array of arrays
		
		String[][] alphabets = 	{	
								{"A","B","C"},
								{"D","E","F"},
								{"G","H","I"}
							};
		
		/*
		alphabets[0][0] = "A";
		alphabets[0][1] = "B";
		alphabets[0][2] = "C";
		alphabets[1][0] = "D";
		alphabets[1][1] = "E";
		alphabets[1][2] = "F";
		alphabets[2][0] = "G";
		alphabets[2][1] = "H";
		alphabets[2][2] = "I";
		*/
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.println();
			for(int j=0; j<alphabets[i].length; j++) {
				System.out.print(alphabets[i][j]+" ");
			}
		}
	}
}