package wnbawith4classes;

import java.util.ArrayList;
// collection of Teams
public class Conference {
	private String name;
	private ArrayList<Team> teams;
    public Conference() {
        name = "";
        teams = null;  // we don't have list of teams
    }
    public Conference(String name, ArrayList<Team> teams) {
        this.name = name;
        this.teams = teams;
    }
    // returns the gb for the team that was pass in
	public double getGamesBehindForTeam(Team team) {
        Team leader = teams.get(0);
        double result = (leader.getWins() - team.getWins() + team.getLosses() - leader.getLosses()) / 2.0;
        return result;	
	}
	@Override
	public String toString() {
        String result = "Conference: " + name + "\n";
        for (Team team : teams) {
            result = result + String.format("%s%8.1f",team,getGamesBehindForTeam(team)) + "\n";
        }
        return result;		
	}
}
