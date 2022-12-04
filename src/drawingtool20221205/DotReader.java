package drawingtool20221205;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DotReader {
    public static ArrayList<Dot> fromTextFile(File f) {
        try {
            ArrayList<Dot> dots = new ArrayList<Dot>();
            Scanner fsc = new Scanner(f);
            String line;
            String[] parts;
            Dot dot;
            while (fsc.hasNextLine()) {
                line = fsc.nextLine().trim();
                parts = line.split("\t");
                dot = new Dot(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]));
                dots.add(dot);
            }
            fsc.close();
            return dots;
        } catch (Exception ex) {
            return null;
        }
    }
}
