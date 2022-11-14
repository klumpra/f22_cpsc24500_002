package employeesjson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class EmployeeWriter {
    public static void writeEmployeesToScreen(ArrayList<Employee> employees) {
        for (Employee emp: employees) {
            System.out.println(emp);
        }
    }
    public static boolean writeEmployeesToJSON(ArrayList<Employee> employees, String fname) {
    	JSONObject obj;
    	JSONArray arr = new JSONArray();
    	for (Employee emp : employees) {
    		obj = new JSONObject();
    		obj.put("first", emp.getFirstName());
    		obj.put("last", emp.getLastName());
    		obj.put("salary", emp.getSalary());
    		arr.add(obj);
    	}
    	try {
    		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
    		pw.println(arr.toJSONString());
    		pw.close();
    		return true;
    	} catch (Exception ex) {
    		return false;
    	}
    }
}
