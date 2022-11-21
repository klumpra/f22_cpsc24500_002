package menagerie;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
public class PetWriter {
    public static void writeToScreen(ArrayList<Pet> pets) {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
    public static boolean writeToFile(ArrayList<Pet> pets, String fname) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
            for (Pet pet : pets) {
                pw.println(pet);
            }
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
