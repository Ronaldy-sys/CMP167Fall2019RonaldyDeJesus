import java.io.StringWriter;
import java.io.PrintWriter;

public class U3 {
		public static void main(String[] args) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			
			pw.print("Celine Dion");
			String name = sw.toString();
			
			System.out.println(name);
			
			System.out.printf("Her name was %-20s OK?", name);
			
			
			
	
	}

}
