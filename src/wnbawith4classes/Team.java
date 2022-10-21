package wnbawith4classes;

public class Team {
	private String name;
	private int wins;
	private int losses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		if (wins < 0) {
			this.wins = 0;
		} else {
			this.wins = wins;
		}
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		if (losses < 0) {
			this.losses = 0;
		} else {
			this.losses = losses;
		}
	}
	public Team() {
		name = "";
		wins = 0;
		losses = 0;
	}
	public Team(String name, int wins, int losses) {
		setName(name);
		setWins(wins);
		setLosses(losses);
	}
	public double getWinningPercentage() {
		return (double)wins/(wins+losses);
	}
	@Override
	public String toString() {
		return String.format("%-20s%10d%10d%10.3f",name,wins,losses,getWinningPercentage());	
	}
}
