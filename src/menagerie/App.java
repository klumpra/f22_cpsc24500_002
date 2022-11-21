package menagerie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collections;
public class App {
    public static void showHeader() {
        System.out.println("************************************************************");
        System.out.println("              Menagerie V1.0: The Pet Simulator");
        System.out.println("************************************************************");
        System.out.println("");
    }
    public static void printMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("1. Add a new pet.");
        System.out.println("2. Print list of pets.");
        System.out.println("3. Save pets to a file.");
        System.out.println("4. Load pets from a file.");
        System.out.println("5. Simulate a day in the life of your pets.");
        System.out.println("6. Clear your list of pets.");
        System.out.println("7. Exit");
        System.out.print("Enter the number of your choice: ");
    }
    public static void main(String[] args) {
        showHeader();
        int choice,age;
        double weight;
        String petType,name, fname;
        ArrayList<Pet> pets = new ArrayList<Pet>();
        Scanner sc = new Scanner(System.in);
        do {
            printMenu();
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter d for dog, c for cat, or f for fish: ");
                petType = sc.next();
                System.out.print("Enter name, age, and weight: ");
                name = sc.next();
                age = sc.nextInt();
                weight = sc.nextDouble();
                if (petType.equalsIgnoreCase("d")) {
                    pets.add(new Dog(name,age,weight));
                } else if (petType.equalsIgnoreCase("c")) {
                    pets.add(new Cat(name,age,weight));
                } else if (petType.equalsIgnoreCase("f")) {
                    pets.add(new Fish(name,age,weight));
                }
                System.out.println();
                Collections.sort(pets);
            } else if (choice == 2) {
                System.out.println();
                System.out.println("Here is your list of pets: ");
                PetWriter.writeToScreen(pets);
                System.out.println();
            } else if (choice == 3) {
                System.out.println();
                sc.nextLine();
                System.out.print("Enter name of file to save: ");
                fname = sc.nextLine();
                if (PetWriter.writeToFile(pets, fname)) {
                    System.out.println("The pets were saved to the file.\n");
                } else {
                    System.out.println("The pets could not be saved to the file.\n");
                }
            } else if (choice == 4) {
                System.out.println();
                sc.nextLine();
                System.out.print("Enter name of file to load: ");
                fname = sc.nextLine();
                pets = PetReader.readPetsFromFile(fname);
                if (pets == null) {
                    System.out.println("The pets could not be read from the file.\n");
                } else {
                    System.out.println("The pets were read from the file.\n");
                }
            } else if (choice == 5) {
                System.out.println();
                System.out.println("Here is a simulation of a day in the life of your pets: ");
                for (int i = 1; i <= 24; i++) {
                    System.out.printf("\nHOUR %2d\n",i);
                    System.out.println("-------");
                    for (Pet pet : pets) {
                        System.out.println(pet.act());
                    }
                }
                System.out.println();
            } else if (choice == 6) {
                pets.clear();
            }
        } while (choice != 7);
        System.out.println();
        System.out.println("Thank you for using Menagerie. We hope you had fun.");
    }
}
