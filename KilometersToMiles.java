import java.util.Scanner;
public class KilometersToMiles {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double kiloMeters = 0;
		double miles = 0;
		System.out.println("input the amount of kilometers");
		kiloMeters = scnr.nextDouble();
		miles = kiloMeters*0.621;
		System.out.printf("%.0f Kilometers is equal to %.3f miles\n",kiloMeters,miles);
	}
}
