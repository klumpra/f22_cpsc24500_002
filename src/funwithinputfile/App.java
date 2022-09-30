package funwithinputfile;
import java.util.Scanner;
import java.io.File;
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of file: ");
		String filename = sc.nextLine();
		String line;
		try {
			Scanner fsc = new Scanner(new File(filename));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim().toUpperCase();
				System.out.println(line);
			}
			fsc.close();
		} catch (Exception ex) {
			System.out.println("A problem happened reading from the file.");
		}
	}
}
