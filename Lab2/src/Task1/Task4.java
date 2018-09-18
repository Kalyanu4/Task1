package Task1;
import java.util.Scanner;
public class Task4 {
	public static void main(String[]args) {
		Scanner f = new Scanner(System.in);
		System.out.println("Enter range a to b");
		int a = f.nextInt();
		int b = f.nextInt();
		System.out.println("Enter step h");
		int h = f.nextInt();
do {
	for(int x=a; x<=b; x=x+h) {
		double y = Math.pow(x+2,3);
		System.out.println("y=" +y);
	}
}while(3==2);
	f.close();
	}
	}

