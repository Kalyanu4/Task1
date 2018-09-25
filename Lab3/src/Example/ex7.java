package Example; 
import javax.swing.JOptionPane;  // Need for using graphic input
public class ex7 { 
	public static void main(String[]args)  {
		// Declare variables 
		String rad; 
		double radius,area; 
		rad = JOptionPane.showInputDialog("Enter the radius of circle: "); //construct for graphic input 
		radius = Double.parseDouble(rad); //convert string to double
		if (radius <= 0) {
			System.out.println("Value can't be negative");
		}
		else {area =  radius * radius * Math.PI;  // some math calculation
		System.out.println("The area is " + area); // show prompting massage 
	}}
}
