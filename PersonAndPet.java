import java.util.Scanner;
public class PersonAndPet {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is your name?");
		String UserName = scnr.next();
		System.out.println("The name of your favorite pet?");
		String PetName = scnr.next();
		int petNameLength = PetName.length();
		System.out.printf("%s, %s has %d characters", UserName, PetName, petNameLength);
	}
}
