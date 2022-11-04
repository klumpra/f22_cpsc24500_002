package funwithshapesoo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
// view class for the model established Shape
public class ShapeWriter {
	public static void writeToScreen(ArrayList<Shape> shapes) {
		for (Shape s : shapes) {
			System.out.println(s);
		}
	}
	public static boolean writeToFile(ArrayList<Shape> shapes, String fname) {
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
}