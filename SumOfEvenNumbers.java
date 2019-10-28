import java.util.Scanner;
public class SumOfEvenNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Put a number for N for the sum of all even until N");
		int N = scnr.nextInt();
		int N2 = 0;
		for(int i = 1; i <= N; i++) {
			if(i % 2 == 0) {
				//System.out.print(N);
				N2 = N2 + i;
			}
		}
		System.out.println(N2);
	}
}
