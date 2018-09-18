package Task1;

import java.util.Scanner;

public class Task5 {
	public static void main(String[]args) {
		Scanner f = new Scanner(System.in);
		System.out.println("Enter how many cash u want to drop in your bank accout");
		double cash = f.nextDouble();
		System.out.println("With what % ?");
		double percentage = f.nextDouble();
		System.out.println("How many cash u want get at the end?");
		int cashEnd = f.nextInt();
	for(int i=1; cash<=cashEnd; i++) {
		cash = cash/100 * percentage + cash;
		System.out.format("Money at year %d cash %f\n", i  ,cash);
	}	f.close();
}
}

