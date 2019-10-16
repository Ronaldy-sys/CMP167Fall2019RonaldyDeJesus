import java.util.Scanner;
public class SmsAbbreviations2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter The SMS Abbreviation");
		String abb = scnr.nextLine();
		String abb2 = abb.toUpperCase();
		String translation = "";
		translation = Translation(abb2);
		System.out.println(abb + " means " + translation);
	}
	public static String Translation(String abbrev) {
		String Tras = "";
		if(abbrev.equals("BFF")) {
			Tras = "Best Friends Forever";
			return Tras;
		}
		if(abbrev.equals("IMHO")) {
			Tras = "In my Humble Opinion";
			return Tras;
		}
		if(abbrev.equals("2QT")) {
			Tras = "Too Cute";
			return Tras;
		}
		return Tras;
	}
}
