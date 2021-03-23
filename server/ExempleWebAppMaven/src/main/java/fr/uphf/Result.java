package fr.uphf;

public class Result {
	
	String teamOneName;
	int scoreTeamOne;
	
	String teamOneSecond;
	int scoreTeamSecond;
	
	public Result() {
		
	}
	public Result(String teamOneName, int scoreTeamOne, String teamOneSecond, int scoreTeamSecond) {
		super();
		this.teamOneName = teamOneName;
		this.scoreTeamOne = scoreTeamOne;
		this.teamOneSecond = teamOneSecond;
		this.scoreTeamSecond = scoreTeamSecond;
	}
	public String getTeamOneName() {
		return teamOneName;
	}
	public void setTeamOneName(String teamOneName) {
		this.teamOneName = teamOneName;
	}
	public int getScoreTeamOne() {
		return scoreTeamOne;
	}
	public void setScoreTeamOne(int scoreTeamOne) {
		this.scoreTeamOne = scoreTeamOne;
	}
	public String getTeamOneSecond() {
		return teamOneSecond;
	}
	public void setTeamOneSecond(String teamOneSecond) {
		this.teamOneSecond = teamOneSecond;
	}
	public int getScoreTeamSecond() {
		return scoreTeamSecond;
	}
	public void setScoreTeamSecond(int scoreTeamSecond) {
		this.scoreTeamSecond = scoreTeamSecond;
	}
	
	
}
