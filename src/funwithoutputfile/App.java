package funwithoutputfile;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of file: ");
		String filename = sc.nextLine();
		System.out.print("Enter name of output file: ");
		String outFilename = sc.nextLine();
		String line;
		try {
			Scanner fsc = new Scanner(new File(filename));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(outFilename))));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim().toUpperCase();
				System.out.println(line);
				pw.println(line);
			}
			fsc.close();
			pw.close();
		} catch (Exception ex) {
			System.out.println("A problem happened reading from the file.");
		}
	}
}
