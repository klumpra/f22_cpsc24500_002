package drawingtool20221205;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DotWriter {
    public static void toScreen(ArrayList<Dot> dots) {
        for (Dot d : dots) {
            System.out.println(d);
        }
    }
    public static boolean toTextFile(ArrayList<Dot> dots, File f) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            for (Dot d : dots) {
                pw.println(d);
            }
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
