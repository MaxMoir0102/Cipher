import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("**BOX CIPHER**");
		System.out.println();
		System.out.println("Enter a message:");
		String message = in.nextLine();
		String result = "";

		System.out.println("How many columns would you like to encrypt with?");
		int col = in.nextInt();
		for (int x = 0; x < col; x++) {
			for (int i = x; i < message.length(); i += col) {
				char ch = message.charAt(i);

				result += ch;
			}
		}
		System.out.println(result);
		// Read in String
		// Read in how many columns
		// break the String into columns
		// Rewrite the message by reading the columns vertically
		// Print out the message
	}

}
