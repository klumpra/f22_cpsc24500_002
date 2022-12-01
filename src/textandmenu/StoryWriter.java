package textandmenu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class StoryWriter {
    public static void writeToScreen(Story story) {
        System.out.println(story);
    }
    public static boolean writeToFile(Story story, String fname) {
        return writeToFile(story, new File(fname));
    }
    public static boolean writeToFile(Story story, File f) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            pw.println(story);
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
