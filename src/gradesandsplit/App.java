package gradesandsplit;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name and grades separated by spaces: ");
		String line = sc.nextLine();
		String[] parts = line.split(" ");
		String name = parts[0];
		double total = 0, score;
		for (int i = 1; i < parts.length; i++) {
			score = Double.parseDouble(parts[i]);
			total = total + score;
		}
		double avg = total / (parts.length - 1);
		System.out.printf("%s earned an average of %.2f.\n", name, avg);
	}

}
