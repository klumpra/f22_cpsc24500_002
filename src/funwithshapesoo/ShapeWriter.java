package funwithshapesoo;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

// view class for the model established Shape
public class ShapeWriter {
	public static void writeToScreen(ArrayList<Shape> shapes) {
		for (Shape s : shapes) {
			System.out.println(s);
		}
	}
	public static boolean writeToText(ArrayList<Shape> shapes, String fname) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
			for (Shape s : shapes) {
				pw.println(s);
			}
			pw.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public static boolean writeToBinary(ArrayList<Shape> shapes, String fname) {
		try {
			FileOutputStream fos = new FileOutputStream(new File(fname));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(shapes);
			oos.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public static boolean writeToXML(ArrayList<Shape> shapes, String fname) {
		try {
			XMLEncoder enc = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(new File(fname))));
			enc.writeObject(shapes);
			enc.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
    public static boolean writeToJSON(String fname, ArrayList<Shape> shapes) {
        HashMap<String,String> values;
        JSONObject obj;
        JSONArray arr = new JSONArray();
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
            for (Shape s : shapes) {
                values = s.mapValues();
                obj = new JSONObject(values);
                arr.add(obj);
            }
            pw.println(arr.toJSONString());
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
