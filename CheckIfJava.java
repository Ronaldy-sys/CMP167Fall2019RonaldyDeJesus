import java.util.Scanner;
public class CheckIfJava {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String Statement = scnr.nextLine();
		boolean Jes = hasJava(Statement);
		System.out.println(Jes);
	}
	public static boolean hasJava(String Sentence) {
		Scanner scnr = new Scanner(System.in);
		boolean St = Sentence.contains("Java");
		return St;
		
	}
}
