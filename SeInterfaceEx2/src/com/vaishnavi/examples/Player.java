package com.vaishnavi.examples;

public class Player {

	public int PlayerCode;
	public String PlayerName;
	public int scoredRuns;
	
	public Player()
	{
		this.PlayerCode=-1;
		this.PlayerName="#UnknownPlayerName";
		this.scoredRuns=-1;
	}

	public Player(int playerCode, String playerName, int scoredRuns) {
		super();
		PlayerCode = playerCode;
		PlayerName = playerName;
		this.scoredRuns = scoredRuns;
	}

	@Override
	public String toString() {
		
		return "Player [PlayerCode="+PlayerCode +",playerName="+PlayerName+",scoredRuns="+scoredRuns+"]";
	}
	
	

}
