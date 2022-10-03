package arrayofnumbers;
import java.util.Random;
import java.util.Scanner;
public class App {
	public static int[] generateRandomNumbers(int numCount, int maxNum, Random rnd) {
		int[] result = new int[numCount];
		for (int i = 0; i < numCount; i++) {
			result[i] = rnd.nextInt(maxNum);
		}
		return result;
	}
	public static void print(int[] numbers) {
		int count = 0;
		for (int num : numbers) {
			if (count != 0 && count % 5 == 0) {
				System.out.println();
			}
			System.out.printf("%5d",num);
			count = count + 1;
		}
		System.out.println(); 
	}
	public static double findMean(int[] numbers) {
		double total = 0;
		for (int num: numbers) {
			total = total + num;
		}
		double result = total/numbers.length;
		return result;
	}
	public static int findMax(int[] numbers) {
		int result = numbers[0];
		for (int num : numbers) {
			if (num > result) {
				result = num;
			}
		}
		return result;
	}
	public static int findMin(int[] numbers) {
		int result = numbers[0];
		for (int num : numbers) {
			if (num < result) {
				result = num;
			}
		}
		return result;
	}
	public static void printMenu() {
		System.out.println("Here are your options:");
		System.out.println("1. Print");
		System.out.println("2. Mean");
		System.out.println("3. Max");
		System.out.println("4. Min");
		System.out.println("5. Quit");
		System.out.print("Enter the number of your choice: ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int numCount, maxNum;
		System.out.print("How many numbers do you want? ");
		numCount = sc.nextInt();
		System.out.print("What is the maximum number to generate? ");
		maxNum = sc.nextInt();
		int[] numbers;
		numbers = generateRandomNumbers(numCount, maxNum, rnd);
		int choice, theMax, theMin;
		double mean;
		do {
			printMenu();
			choice = sc.nextInt();
			if (choice == 1) {
				print(numbers);
			} else if (choice == 2) {
				mean = findMean(numbers);
				System.out.printf("The mean is %.2f.\n",mean);
			} else if (choice == 3) {
				theMax = findMax(numbers);
				System.out.printf("The max is %d.\n", theMax);
			} else if (choice == 4) {
				theMin = findMin(numbers);
				System.out.printf("The min is %d.\n", theMin);
			}
		} while (choice != 5);
		System.out.println("Thank you!");
	}
}
