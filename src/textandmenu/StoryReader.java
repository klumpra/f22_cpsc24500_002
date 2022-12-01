package textandmenu;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class StoryReader {
    public static boolean readFromText(String fname, Story story) {
        return readFromText(new File(fname), story);
    }
    public static boolean readFromText(File f, Story story) {
        ArrayList<String> sentences = new ArrayList<String>();
        try {
            Scanner fsc = new Scanner(f);
            String line;
            while (fsc.hasNextLine()) {
                line = fsc.nextLine().trim();
                sentences.add(line);
            }
            story.setSentences(sentences);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
