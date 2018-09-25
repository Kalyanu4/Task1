package Example;
import java.io.Console; // Need for using console 
import java.util.Scanner; // Need for using function Scanner
public class ex8 {
	public static void main(String[]args)  {
		Console f = System.console(); //Declare console 
		if (f == null) { // At eclipse console doesn't work
			System.out.println("Console Objest isn't available");
			System.exit(1); }
	String name = f.readLine("Enter ur name: "); // Read(declare) string
	f.printf("Hello %s%n", name); // Output string on console 
	Scanner in = new Scanner(f.reader()); // Use function for read
	f.printf("Enter an integer: "); // output some text
	int anInt = in.nextInt(); // declare variable 
	f.printf("The integer entered is %d%n", anInt); 
	f.printf("Enter a floating number point :");
	double aDouble = in.nextDouble(); // declare variable
	f.printf("The floating point number entered is %f%n", aDouble);
	in.close(); // close  funct Scanner 
		}
	}


