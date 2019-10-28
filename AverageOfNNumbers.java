import java.util.Scanner;
public class AverageOfNNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What numbers you want to add N");
		double N = scnr.nextInt();
		double N2 = N;
		for(double i = 1; i < N; i++) {
			N2 += i;
		}
		N2 /= N;
		System.out.println(N2);
	}
}
