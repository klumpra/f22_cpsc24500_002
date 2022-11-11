package funwithshapesoo;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.simple.JSONObject;

public class ShapeReader {
	public static ArrayList<Shape> readFromText(String fname) {
		try {
			ArrayList<Shape> result = new ArrayList<Shape>();
			Scanner fsc = new Scanner(new File(fname));
			String line;
			String[] parts;
			double x,y, radius, length, width;
			String shapeType;
			Circle c;
			Rectangle r;
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim();
				parts = line.split("\t");
				shapeType = parts[0];
				x = Double.parseDouble(parts[1]);
				y = Double.parseDouble(parts[2]);
				if (shapeType.equalsIgnoreCase("circle")) {
					radius = Double.parseDouble(parts[3]);
					c = new Circle(x,y,radius);
					result.add(c);
				} else if (shapeType.equalsIgnoreCase("rect")) {
					length= Double.parseDouble(parts[3]);
					width= Double.parseDouble(parts[4]);
					r = new Rectangle(x,y,length,width);
					result.add(r);
				}
			}
			fsc.close();
			return result;
		} catch (Exception ex) {
			return null;
		}
	}
	public static ArrayList<Shape> readFromBinary(String fname) {
		try {
			FileInputStream fis = new FileInputStream(new File(fname));
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Shape> shapes = (ArrayList<Shape>)ois.readObject();
			ois.close();
			return shapes;
		} catch (Exception ex) {
			return null;
		}
	}
	public static ArrayList<Shape> readFromXML(String fname) {
		try {
			XMLDecoder dec = new XMLDecoder(new BufferedInputStream(new FileInputStream(new File(fname))));
			ArrayList<Shape> shapes = (ArrayList<Shape>)dec.readObject();
			dec.close();
			return shapes;
		} catch (Exception ex) {
			return null;
		}
	}
}
