import java.util.Scanner;

public class AnimalPicker {

	public static void main(String[] args) {
		boolean choice = true;
		while(choice) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which animal would you like to see?\n1. Cat\n2. Dog");
		int userInput = input.nextInt();
		
		if (userInput == 1) {
			System.out.println("\" /\\\\_/\\\\\\n( o.o )\\n > ^ <\"");
			choice = false;
		} else if (userInput == 2) {
			System.out.println("\",-.___,-.\\n\\\\_/_ _\\\\_/\\n  )O_O(\\n { (_) }\\n  `-^-\\'   \"");
			choice = false;
		} else {
			System.out.println("Invalid input.");
		}
		
		}
	}
}
