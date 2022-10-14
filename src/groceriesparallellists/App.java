package groceriesparallellists;
import java.util.Scanner;
import java.util.ArrayList;
public class App {
	public static void printShoppingCart(ArrayList<String> names, ArrayList<Double> prices) {
		System.out.println("Here is what you are purchasing: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.printf("%-20s%10.2f\n", names.get(i), prices.get(i));
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// two parallel lists - one for names of grocery items and one for prices
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		names.add("Bread");
		prices.add(2.99);
		names.add("Milk");
		prices.add(2.49);
		names.add("Frozen Pizza");
		prices.add(7.99);
		printShoppingCart(names,prices);
		System.out.print("Enter name of new item: ");
		String newItem = sc.nextLine();
		System.out.print("Enter price of new item: ");
		double newPrice = sc.nextDouble();
		names.add(1,newItem);
		prices.add(1,newPrice);
		printShoppingCart(names,prices);
	}
}
