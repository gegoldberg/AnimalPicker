import java.util.Scanner;

public class AnimalPicker {

	public static void main(String[] args) {
		boolean choice = true;
		while(choice) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which animal would you like to see?\n1. Cat\n2. Dog\n3. Fish");
		int userInput = input.nextInt();
		
		if (userInput == 1) {
			System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
			choice = false;
		} else if (userInput == 2) {
			System.out.println("            __\n(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
			choice = false;
		} else if (userInput == 3) {
			System.out.println("|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/");
			choice = false;
		}
		else {
			System.out.println("Invalid input.");
		}
		
		}
	}
}
