package sumandproduct;
import java.util.Scanner;
public class SumAndProduct {
	public static double computeSum(double n1, double n2, double n3) {
		double total;
		total = n1 + n2 + n3;
		return total;
	}
	public static double computeProduct(double n1, double n2, double n3) {
		double prod;
		prod = n1 *n2 * n3;
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z;
		System.out.print("Enter three numbers separated by spaces: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		double sum, product;
		sum = computeSum(x,y,z);
		product = computeProduct(x,y,z);
		System.out.printf("The numbers are %.2f, %.2f, and %.2f.\n", x,y,z);
		System.out.printf("The sum is %.2f and the product is %.4f\n.",sum,product);
	}
}
