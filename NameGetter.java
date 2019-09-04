
import java.util.Scanner;
public class NameGetter {
	// main method
	// this program starts at the main method
	public static void main(String[] args) {
		//Create Scanner Object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Name and last name");
		String fname = input.next();
		String lname = input.next();
		System.out.println("Thank you, "+fname);
		System.out.println("Oh your last name is "+lname+"!!");
	}
}
