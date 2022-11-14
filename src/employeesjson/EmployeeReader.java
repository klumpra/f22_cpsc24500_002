package employeesjson;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class EmployeeReader {
	public static ArrayList<Employee> readEmployeesFromJSON(String fname) {
		try {
			ArrayList<Employee> employees = new ArrayList<Employee>();
			FileReader reader = new FileReader(new File(fname));
			JSONParser parser = new JSONParser();
			JSONArray arr = (JSONArray)parser.parse(reader);
			Iterator<JSONObject> itr = arr.iterator();
			JSONObject obj;
			String first, last;
			double salary;
			while (itr.hasNext()) {
				obj = itr.next();
				first = obj.get("first").toString();
				last = obj.get("last").toString();
				salary = Double.parseDouble(obj.get("salary").toString());
				employees.add(new Employee(first,last,salary));
			}
			reader.close();
			return employees;
		} catch (Exception ex) {
			return null;
		}
	}
}
