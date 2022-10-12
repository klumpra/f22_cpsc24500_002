package arraylistofnames;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class App {
	public static void printNames(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ray");
		names.add("Karen");
		names.add("Conor");
		names.add("Lauren");
		names.add("Evan");
		String name;
		int pos;
		System.out.print("Enter name and position: ");
		name = sc.next();
		pos = sc.nextInt();
		names.add(pos,name);
		printNames(names);
		System.out.println("Now sorted ...");
		Collections.sort(names);
		printNames(names);
		Random rnd = new Random();
		pos = rnd.nextInt(names.size());
		String awardWinner = names.get(pos);
		System.out.printf("Congrats to %s.\n", awardWinner);
	}
}
