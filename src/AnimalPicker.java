import java.util.Scanner;

public class AnimalPicker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which animal would you like to see?\n1. Cat\n2. Dog");
		int userInput = input.nextInt();
		
		if (userInput == 1) {
			System.out.println("CAT ASCII ART HERE");
		} else if (userInput == 2) {
			System.out.println("DOG ASCII ART HERE");
		} else {
			System.out.println("Invalid input.");
		}
	}
}
