package areamenu;
import java.util.Scanner;
public class App {
	public static void printMenu() {
		System.out.println("Here are your choices: ");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Quit");
		System.out.print("Enter the number of your choice: ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double radius,area, length, width;
		do {
			printMenu();
			try {
				choice = sc.nextInt();
			} catch (Exception ex) {
				ex.printStackTrace();  // only include while working on the code
				System.out.println("You fool. You had to enter an int.");
				sc.nextLine();   // clear the input channel
				choice = -1;
			}
			if (choice == 1) {  // circle
				System.out.print("Enter the radius: ");
				radius = sc.nextDouble();
				area = Math.PI * radius * radius;
				System.out.printf("The area is %.2f.\n", area);
			} else if (choice == 2) {  // rectangle
				System.out.print("Enter the length and width: ");
				length = sc.nextDouble();
				width = sc.nextDouble();
				area = length * width;
				System.out.printf("The area is %.2f.\n", area);
			} else if ((choice != 3) && (choice != -1)) {
				System.out.println("You can't just choose anything you want.");
				System.out.println("Enter a 1, 2, or 3 only.");
			}
		} while (choice != 3);  // i.e. not quit yet
		System.out.println("Thank you");
	}
}
