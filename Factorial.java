import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is the N number");
		int N = scnr.nextInt();
		for(int i = N-1;i > 0;i--) {
			N = N * i;
		}
		System.out.println(N);
	}
}
