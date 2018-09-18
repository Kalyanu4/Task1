package Task1;
import java.util.Scanner;
public class Task2 {
public static void main(String[]args) {
Scanner f = new Scanner(System.in);
System.out.println("Enter growth of first man");
int x = f.nextInt();
System.out.println("Enter growth of second man");
int y = f.nextInt();
System.out.println("Enter growth of third man");
int z = f.nextInt();
 if (x<=y && x<=z) {
	 System.out.println("The first man is the smallest");	 
 }
 else if (y<=x && y<=z) {
	 System.out.println("The second man is the smallest");	
}
 else {
	 System.out.println("The third man is the smallest");
 }f.close();
}
}
