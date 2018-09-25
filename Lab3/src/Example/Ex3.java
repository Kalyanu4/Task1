
package Example;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Ex3 {
	public static void main(String[]args) 
		throws FileNotFoundException { 
			int num1;
			double num2;
			String name;
			Scanner f = new Scanner(new File("files/in.txt")) ;
			name = f.nextLine();
			num1 = f.nextInt();
			num2 = f.nextDouble();			
System.out.printf("Hi %s, the sum of %d and %.2f is %.2f%n", name, num1, num2, num1+num2);
f.close();

	}
	}


