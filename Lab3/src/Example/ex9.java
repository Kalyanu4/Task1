package Example;
import java.io.Console; // Need for using console 
import java.util.Arrays; // This class contains various methods for manipulating arrays
public class ex9 {
static String login; // Declare Login
static char[] password; // Declare pass
public static void main(String[]args)  {
	Console f = System.console(); //Console doesn't work at eclipse 
	if (f == null) {
		System.out.println("Console Objest isn't available");
		System.exit(1); }
	login = f.readLine("Enter ur name: "); // read login
	password = f.readPassword("Enter ur password: ");  // read password
	if(checkPassword(login,password)) {  
		Arrays.fill(password,' ');  // check for accord 
	}
}
static boolean checkPassword(String login, char[]password) { // return true if password accord 
	return true;
}
}
