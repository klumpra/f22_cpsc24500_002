package wnbawith4classes;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

// includes a function for reading a file and returning an ArrayList<Team>
// like WordFileReader in your HW, but that will return LinkedHashMap<String,ArrayList<String>>
public class TeamFileReader {
    public static ArrayList<Team> readTeamsFromFile(String fname) {
        try {
            ArrayList<Team> teams = new ArrayList<Team>();
            Scanner fsc = new Scanner(new File(fname));
            String line;
            String[] parts;
            String name;
            int wins, losses;
            Team team;
            while (fsc.hasNextLine()) {
                line = fsc.nextLine().trim();
                parts = line.split("\t");
                name = parts[0];
                wins = Integer.parseInt(parts[1]);
                losses = Integer.parseInt(parts[2]);
                team = new Team(name,wins,losses);
                teams.add(team);
            }
            fsc.close();
            return teams;
        } catch (Exception ex) {
        	ex.printStackTrace();  // while you fine-tune your code
            return null;  // this means "return nothing" because a problem happened - null means "nothing"
        }
     }

}
