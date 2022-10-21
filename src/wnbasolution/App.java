package wnbasolution;

import java.io.File;
import java.util.Scanner;
public class App {
	public static void printHeader() {
		System.out.println("***************************************************");
		System.out.println("               2022 WNBA STANDINGS");
		System.out.println("***************************************************");
		System.out.println();
	}
	public static void printMenu() {
		System.out.println("What would you like to see?");
		System.out.println("1. Eastern Conference");
		System.out.println("2. Western Conference");
		System.out.println("3. Combined");
		System.out.println("4. Exit");
		System.out.print("Enter the number of your choice: ");
		
	}
	public static void printConference(String whichOne, String[] teams) {
		System.out.println();
		System.out.printf("Standings for the %s Conference\n",whichOne);
		printTableHeading();
		String[] parts;
		String name;
		int wins, losses, leadWins=0, leadLosses=0;
		double behind, pct;
		boolean firstOne = true;
		String behindStr;
		for (String team : teams) {
			parts = team.split("\t");
			name = parts[0];
			wins = Integer.parseInt(parts[1]);
			losses = Integer.parseInt(parts[2]);
			if (firstOne) {
				leadWins = wins;
				leadLosses = losses;
				behind = 0;
			} else {
				behind = (leadWins - wins + losses - leadLosses)/2.0;
			}
			firstOne = false;
			pct = (double)wins/(wins+losses);
			if (behind == 0) {
				behindStr = " - ";
			} else {
				behindStr = String.format("%3.1f", behind);
			}
			System.out.printf("%-20s%8d%8d%8.3f%8s\n",name,wins,losses,pct,behindStr);
		}
		System.out.println();
	}
	// desc is "description - tab-delimited with team followed by wins followed by losses
	public static double getWinningPercentage(String desc) {
		String[] parts = desc.split("\t");
		int wins = Integer.parseInt(parts[1]);
		int losses = Integer.parseInt(parts[2]);
		return (double)wins/(wins+losses);
	}
	public static void printTableHeading() {
		System.out.printf("%-20s%8s%8s%8s%8s\n","Team Name","Wins","Losses","PCT","GB");
		
	}
	public static String[] combineConferences(String[] east, String[] west) {
	    String[] result = new String[east.length + west.length];
	    int eastPos = 0; // where we are in the east conf
	    int westPos = 0; // where we are in the west conf
	    double eastPct, westPct;  // winning percentages of the teams we're looking at
	    int fillPos = 0;   // the number of the slot in the combined list result we are filling
	    while (eastPos < east.length && westPos < west.length) {  // while I haven't run out of teams in either east or west
	        eastPct = getWinningPercentage(east[eastPos]);
	        westPct = getWinningPercentage(west[westPos]);
	        if (eastPct >= westPct) {
	            result[fillPos] = east[eastPos];
	            eastPos = eastPos + 1;  // eliminate from further consideration
	        } else {
	            result[fillPos] = west[westPos];
	            westPos = westPos + 1;
	        }
	        fillPos = fillPos + 1;  //  get ready for next addition to result array
	    }
	    if (eastPos < east.length) {
	        for (int i = eastPos; i < east.length; i++) { // adding the remaining teams from the east
	            result[fillPos] = east[eastPos];
	            fillPos = fillPos + 1;
	            eastPos = eastPos + 1;
	        }
	    } else {    // add the rest of the west teams
	        for (int i = westPos; i < west.length; i++) {
	            result[fillPos] = west[westPos];
	            fillPos = fillPos + 1;
	            westPos = westPos + 1;
	        }
	    }
	    return result;
	}
	public static void main(String[] args) {
		String fname;
		Scanner sc = new Scanner(System.in);
		printHeader();
		System.out.print("Enter the standings filename: ");
		fname = sc.nextLine();
		String conference="", line;
		String[] parts;
		String[] eastTeams = new String[6];
		String[] westTeams = new String[6];
		String[] combined;   // will be filled with teams from the two conferences sorted by winning pct
		int choice;
		int eastCount = 0, westCount = 0; // how many eastern and western teams read so far
		try {
			Scanner fsc = new Scanner(new File(fname));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim();
				if (line.length() > 0) {
					if (line.startsWith("Conference")) {
						parts = line.split(" ");
						conference = parts[1];
					} else {   // a line that defines a team
						if (conference.equals("Eastern")) {
							eastTeams[eastCount] = line;
							eastCount++;
						} else {
							westTeams[westCount] = line;
							westCount++;
						}
					}
				}
			}
			fsc.close();
			System.out.println("The teams have been read.");
			do {
				printMenu();
				try {
					choice = sc.nextInt();
				} catch (Exception ex) {
					choice = -1;
					sc.nextLine();
				}
				if (choice==1) {
					printConference("Eastern",eastTeams);
				} else if (choice==2) {
					printConference("Western",westTeams);
				} else if (choice==3) {
				    combined = combineConferences(eastTeams,westTeams);
					printConference("Combined",combined);
				} else if (choice != 4) {
					System.out.println("That is an invalid choice.\n");
				}
				
			} while (choice != 4);
		} catch (Exception ex) {
			System.out.println("Could not open the file. Exiting the program.");
		}
		System.out.println("\nThank you for using this program.");
	}
}
