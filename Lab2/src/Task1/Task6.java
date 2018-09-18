package Task1;
import java.util.Scanner;
public class Task6 {
	public static void main(String[]args) {
		Scanner f = new Scanner(System.in);
		System.out.println("Enter range a to b");
		int a = f.nextInt();
		int b = f.nextInt();
		int sum=0;
for (int i=a; i<=b; ++i) {
	if((i%2)==1 || (i%2==-1)) {
		sum= sum +i;
		System.out.format("sum = %d\n",sum);
	} 
} f.close();

	}
}