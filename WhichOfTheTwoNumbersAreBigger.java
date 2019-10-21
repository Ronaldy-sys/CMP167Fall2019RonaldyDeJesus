import java.util.Scanner;
public class WhichOfTheTwoNumbersAreBigger {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Input the first number");
		int Number1 = scnr.nextInt();
		System.out.println("Input the second number");
		int Number2 = scnr.nextInt();
		if(Number1 > Number2)
			System.out.printf("%d is bigger than %d", Number1, Number2);
		else
			System.out.printf("%d is bigger than %d", Number2, Number1);
	}
}