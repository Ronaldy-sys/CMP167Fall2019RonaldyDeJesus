import java.util.Scanner;
public class Unit4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Whats your name?");
		String name;
		name = in.nextLine();
		System.out.printf("Ok %s, Enter your age\n", name);
		int age = in.nextInt();
		if (age<= 18) {
			System.out.println("What's up");
		}
		else if(age > 18) {
			System.out.println("Greetings");
		}
		else if (age >= 25) {
			System.out.println("you kinda old");
		}
		else 
			System.out.print("You stupid");
	}
}
