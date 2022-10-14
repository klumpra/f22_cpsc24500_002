package gradeslinkedhashmap;

import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of file: ");
		String fname;
		fname = sc.nextLine();
		String line;
		String[] parts;
		String name;
		ArrayList<Integer> personScores;
		LinkedHashMap<String,ArrayList<Integer>> grades = new LinkedHashMap<String,ArrayList<Integer>>();
		try {
			Scanner fsc = new Scanner(new File(fname));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim();
				parts = line.split("\t");
				name = parts[0];
				personScores = new ArrayList<Integer>();
				for (int i = 1; i < parts.length; i++) {
					personScores.add(Integer.parseInt(parts[i]));
				}
				grades.put(name, personScores);
			}
			fsc.close();
			personScores = grades.get("Karen");
			for (int score : personScores) {
				System.out.println(score);
			}
		} catch (Exception ex) {
			
		}
	}
}
