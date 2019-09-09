import java.util.Scanner;
public class Week2Sum {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		int num1 = scnr.nextInt();
		int num2 = scnr.nextInt();
		int num3 = scnr.nextInt();
		int result = (num1 + num2 + num3);
		System.out.println(result);
	}
}
