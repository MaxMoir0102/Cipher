import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// Read in message
		System.out.println("**CAESAR CIPHER**");
		System.out.println();
		System.out.println("Please enter your message:");
		System.out.println();
		String message = in.nextLine();
		String output = "";
		// Read in shift
		System.out.println("Please enter a letter to shift by:");
		char shift = in.nextLine().toUpperCase().charAt(0);
		int numShift = (int) (shift - 'A');

		for (int x = 0; x < message.length(); x++) {
			char letter = message.charAt(x);

			letter = message.charAt(x);
			if (Character.isAlphabetic(letter)) {
				if (Character.isUpperCase(letter)) {
					letter += numShift;
					if (letter > 'Z') {
						letter -= 26;
					}
				} else {
					letter += numShift;
					if (letter > 'z') {
						letter -= 26;
					}
				}

			}

			output += letter;
		}
		System.out.println(output);
		// Loop through message
		// if letter is alphabetic
		// apply shift
		// if letter is past 'Z'
		// subtract 26
		// add letter to output

		// print output

	}
}
