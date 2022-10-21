package wnbawith4classes;
import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of file: ");
        String fname = sc.nextLine();
        ArrayList<Team> teams = TeamFileReader.readTeamsFromFile(fname);
        Conference conf = new Conference("Eastern",teams);
        System.out.println(conf);
    }
}
