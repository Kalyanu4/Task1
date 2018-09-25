package Example;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Ex4 {
	public static void main(String[]args) {
		try {
			Scanner f = new Scanner(new File("files/in.txt"));
			String str = f.nextLine();
			int num1 = f.nextInt();
			double num2 = f.nextDouble();
			System.out.printf("Hi %s, the sum of %d and %.2f is %.2f%n", str, num1, num2, num1 + num2);
			f.close();
			}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
