package grocerieslinkedhashmap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class App {
	public static void printShoppingCart(LinkedHashMap<String, Double> groceries) {
		double price;
		System.out.println("Here is what is in your cart: ");
		for (String name : groceries.keySet()) {
			price = groceries.get(name);
			System.out.printf("%-20s%10.2f\n",name,price);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, Double> groceries = new LinkedHashMap<String, Double>();
		groceries.put("bread", 2.99);
		groceries.put("milk", 2.49);
		groceries.put("frozen pizza", 7.99);
		printShoppingCart(groceries);
		groceries.remove("milk");
		printShoppingCart(groceries);
		System.out.print("What do you want to see the price for? ");
		String name = sc.nextLine();
		double price;
		if (groceries.containsKey(name)) {
			price = groceries.get(name);
			System.out.println(price);
		} else {
			System.out.println("Not in your cart.");
		}
	}
}
