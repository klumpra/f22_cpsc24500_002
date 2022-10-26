package employeewithclasses;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

/* this is a library-style view class.
 * it allows us to write employee data (the model) to the screen and
 * to a file
 */
public class EmployeeWriter {
	public static void writeEmployeesToScreen(ArrayList<Employee> emps) {
		for (Employee emp : emps) {
			System.out.println(emp);
		}
	}
	public static boolean writeEmployeesToFile(ArrayList<Employee> emps,
		String fileName) {
		try {
			PrintWriter pw = 
					new PrintWriter(new BufferedWriter(
							new FileWriter(new File(fileName))));
			for (Employee emp : emps) {
				pw.println(emp);
			}
			pw.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
}







