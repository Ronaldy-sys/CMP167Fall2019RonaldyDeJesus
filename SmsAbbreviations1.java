import java.util.Scanner;
public class SmsAbbreviations1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter The SMS Abbreviation: ");
		String abbre = scnr.nextLine();
		abbre = abbre.toUpperCase();
		String transla = "";
		transla = Translate(abbre);
		System.out.println("The Translation Is " + transla);
	}
	public static String Translate(String abbrev) {
		String tra = "";
		if(abbrev.equals("LOL")){
			tra = "Laughing At Loud";
			return tra;
		}
		if(abbrev.equals("TMI")) {
			tra = "Too Much Information";
			return tra;
		}
		if(abbrev.equals("SMH")) {
			tra = "Shaking My Head";
			return tra;
		}
		tra = "NO TRANSLATION";
		return tra;
	}
}
