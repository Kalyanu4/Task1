package Example;
import java.util.Scanner;
public class ex1 {
	public static void main(String[]args) {
Scanner f = new Scanner(System.in); 
int num;
double num1;
String name;
System.out.println("Enter a string");
name = f.nextLine(); 
System.out.println("Enter an integer");
num = f.nextInt();
System.out.println("Enter a floating point");
num1 = f.nextDouble();
System.out.printf("Sum %s of %d & %.2f is %.2f%n", name, num, num1, num1 + num);
f.close();
}
	}


