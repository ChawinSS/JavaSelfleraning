import javax.swing.JOptionPane;

public class Main{
	public static void main(String[] args){
		
		int age;
		double height;
		String name;
		String food;
		
		name = JOptionPane.showInputDialog("Your name");
		JOptionPane.showMessageDialog(null, "Your name is "+ name);
		
		age= Integer.parseInt(JOptionPane.showInputDialog("Your age"));
		JOptionPane.showMessageDialog(null," Your age is "+ age);
		
		height = Double.parseDouble(JOptionPane.showInputDialog("Your height"));
		JOptionPane.showMessageDialog(null, "Your height is"+ height);

		food = JOptionPane.showInputDialog("Your favorit food");
		JOptionPane.showMessageDialog(null, "Your food is"+ food);
		
		JOptionPane.showMessageDialog(null, "Your name is "+ name + " .You are "+ age +" years old"+ " .your height is "+ height + "and your favorite food is"+ food);
	}
}