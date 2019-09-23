import java.util.Scanner;
public class Week4P2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;
		int creditScore, age;
		
		System.out.println("Hello I'm a car dealer,\n do you want to buy a car");
		answer = input.next();
		
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("What you buying?");
			System.out.println("Wait, what's your age?");
			age = input.nextInt();
			if(age >= 25) {
				System.out.println("Ok, good");
				System.out.println("What model do you want?");
				String answer2 = input.next();
				checkMode1(answer2);
			}
		}else {
			System.out.println("Come back when you not broke.");
		}
			
	}
	public static void checkMode1(String model) {
		switch(model) {
		case "Ferrari_488GTB":
			System.out.println("$262,647.00");
			break;
		case "2018_Ferrari_California":
			System.out.println("$202,723.00");
			break;
		case "Lambo_Urus":
			System.out.print("$200,000.00");
			break;
		default:
			System.out.println("We don't have it in stores at the moment, please come back later.");
		}
	}
}
