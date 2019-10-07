import java.util.Scanner;
public class week6P1 {
	public static void main(String[] args) {
		int prod1;
		int prod2;
		int prod3;
		int resof1;
		int sum1;
		int sum2;
		int resof2;
		int three1;
		int resof3;
		Scanner scnr = new Scanner(System.in);
		System.out.println("put three values for product three");
		prod1 = scnr.nextInt();
		prod2 = scnr.nextInt();
		prod3 = scnr.nextInt();
		resof1 = productThree(prod1,prod2,prod3);
		System.out.println(resof1);
		System.out.println("Two values to add together");
		sum1 = scnr.nextInt();
		sum2 = scnr.nextInt();
		resof2 = sumTwo(sum1,sum2);
		System.out.println(resof2);
		System.out.println("Average of adding all these nums");
		three1 = scnr.nextInt();
		resof3 = numberthree(three1);
		System.out.println(resof3);
		
		
	}
	public static int productThree(int a, int b, int c) {
		return a * b * c;
	}
	public static int sumTwo(int n, int m) {
		int sumOf = n;
		for(int i = n + 1;i <= m;i++)
			sumOf += i;
		return sumOf;
	}
	public static int numberthree(int a) {
		int theSum = 1;
		int average;
		for(int i = 0; i <= a; i++) {
			theSum += i;
		}
		average = theSum/a;
		return average;
			
	}
}
