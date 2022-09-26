package payrollwhileloop;

import java.util.Scanner;

public class App {
	public static void printPaySummary(double payRate, double hoursWorked, double grossPay,
			double taxes, double netPay) {
		System.out.println("Here is the employee's pay summary...");
		// table. First column 20 characters wide left-justified of labels
		// second column 10 characters wide right-justified with 2 digits after decimal
		System.out.printf("%-20s%10.2f\n","Hourly pay rate",payRate);
		System.out.printf("%-20s%10.2f\n","Hours worked",hoursWorked);
		System.out.printf("%-20s%10.2f\n","Gross pay",grossPay);
		System.out.printf("%-20s%10.2f\n","Taxes withheld",taxes);
		System.out.printf("%-20s%10.2f\n","Take-home pay",netPay);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String doAgain = "y";
		double payRate, hoursWorked, grossPay, taxes, netPay, taxRate = 0.0875;
		int count = 0;
		while (doAgain.equalsIgnoreCase("y")) {
			count = count + 1;
			System.out.printf("Employee #%d\n",count);
			System.out.print("Enter pay rate and hours worked: ");
			payRate = sc.nextDouble();
			hoursWorked = sc.nextDouble();
			grossPay = hoursWorked * payRate;
			taxes = taxRate * grossPay;
			netPay = grossPay - taxes;
			printPaySummary(payRate,hoursWorked,grossPay,taxes,netPay);
			System.out.print("Do you have another employee (y or n)? ");
			doAgain = sc.next();
			System.out.println();
		}
		System.out.println("Thank you for using this program.");
	}
}
