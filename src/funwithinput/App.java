package funwithinput;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		System.out.print("Enter a double: ");
		double val = sc.nextDouble();
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.printf("integer %d, double %.2f, name %s\n", num,val,name);
		System.out.print("Enter a phrase: ");
		sc.nextLine(); // suck in that remaining end-of-line character before reading the nextLine
		String phrase = sc.nextLine();
		System.out.println(phrase);
	}
}
