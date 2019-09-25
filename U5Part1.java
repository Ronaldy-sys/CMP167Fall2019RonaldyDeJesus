import java.util.Scanner;
import java.util.Random;
public class U5Part1 {
	public static void main(String[] args) {
		double budget = 99.99;
		double ticketCost = 1.45;
		Scanner in = new Scanner(System.in);
		
		System.out.println("LottoGame is a lotto game for you to play");
		System.out.printf("You have a budget of $%.2f to spend%n",budget);
		
		System.out.println("Would you like to play?");
		String answer = in.next();
		while(answer.equalsIgnoreCase("yes")) {
			if(budget >= ticketCost) {
				budget = budget-ticketCost;
				System.out.println("You have been played!");
				System.out.printf("You have $%.2f to spend%n", budget);
				if(play()) {
					System.out.printf("You won $%.2f%n" , ticketCost*2);
					budget += ticketCost*2;
				}
			}
			else{
				System.out.println("Not enough money, Go make money and come back");
				break;				
			}
			System.out.println("Awesome, would you like to play again? Yes/No");
			answer=in.next();
		}
			System.out.println("Okay, come back soon!");
			
			}
	public static boolean play() {
		Random rGen = new Random();
		int num = rGen.nextInt(2);
			
		return (num>0)? true:false;
		}
		
	}

