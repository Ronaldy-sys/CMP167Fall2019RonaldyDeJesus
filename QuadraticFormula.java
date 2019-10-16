import java.util.Scanner;
public class QuadraticFormula {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double x = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		System.out.println("Put in three values a b and c");
		a = scnr.nextInt();
		b = scnr.nextInt();
		c = scnr.nextInt();
		x = ABC(a,b,c);
		//double x2 = ABC(a,-b,c);
		//System.out.println(x);
		//System.out.println(x2);
	}
	public static double ABC(double a, double b, double c) {
		double srt = 0;
		double b2 = Math.pow(b, 2);
		double insrt = (b2 - (4)*(a)*(c));
		b = b * -1;
		srt = Math.sqrt(insrt);
		double Numer = b - srt;
		double Numer2 = b + srt;
		double a2 = 2 * a;
		double Numer3 = Numer/a2;
		double Numer4 = Numer2 /a2 ;
		System.out.printf("The zeroes are [%.3f,%.3f]", Numer4, Numer3);
		//System.out.println(Numer4);
		//System.out.println(Numer3);
		return Numer3;
		
	}
}
