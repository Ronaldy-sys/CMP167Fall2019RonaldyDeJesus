import java.util.Scanner;
public class AnyNameYouWant {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int Num1;
		int Num2;
		System.out.println("Input 2 numbers");
		Num1 = scnr.nextInt();
		Num2 = scnr.nextInt();
		int Sum = Num1 + Num2;
		System.out.println("The Sum is = " + Sum);
		System.out.println("Give a number to n");
		int N = scnr.nextInt();
		int SN;
		for(int i = 1; i < N + 1; i++) {
			System.out.println(i);
		}
		for(int i = 1; i < N + 1; i++) {
			SN = i * i;
			System.out.printf("Square of %d is %d\n",i,SN);
		}
		for(int i = 1; i < 101; i++) {
			while(i % 2 != 0) {
				continue;
			}
			do {
				System.out.printf("%d is an even number\n", i);
				break;
			}while(i % 2 == 0);
	
		}
			
	}
}
