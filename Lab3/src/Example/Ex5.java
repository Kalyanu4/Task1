package Example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
public class Ex5 {
	public static void main(String[]args) 
		throws FileNotFoundException { 
			Formatter f = new Formatter(new File("files/out.txt"));
		int num1=2017;
		double num2=10.10;
		String str = "name";
		f.format("Hi %s,%n", str);
		f.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1+num2);
		f.close();
		System.out.println("Smile");
		}
		
}
