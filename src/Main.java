import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println(">");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = "";
			if (sc.hasNext()) {
				input = sc.next();
				System.out.println(input);
				
			}
		}
	}
}
