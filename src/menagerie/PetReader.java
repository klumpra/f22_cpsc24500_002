package menagerie;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class PetReader {
    public static ArrayList<Pet> readPetsFromFile(String fname) {
        try {
            ArrayList<Pet> pets = new ArrayList<Pet>();
            Scanner fsc = new Scanner(new File(fname));
            String line;
            String[] parts;
            String type, name;
            double weight;
            int age;
            while (fsc.hasNextLine()) {
                line = fsc.nextLine().trim();
                parts = line.split("\t");
                type = parts[0].trim();
                name = parts[1].trim();
                age = Integer.parseInt(parts[2].trim());
                weight = Double.parseDouble(parts[3].trim());
                if (type.equals("dog")) {
                    pets.add(new Dog(name,age,weight));
                } else if (type.equals("cat")) {
                    pets.add(new Cat(name,age,weight));
                } else if (type.equals("fish")) {
                    pets.add(new Fish(name,age,weight));
                }
            }
            return pets;
        } catch (Exception ex) {
            return null;
        }
    }
}
