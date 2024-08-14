package com.kbo.domain;

public class TeamRecord {
    private String rank;
    private String teamName;
    private String winRate;

    // Constructor
    public TeamRecord(String rank, String teamName, String winRate) {
        this.rank = rank;
        this.teamName = teamName;
        this.winRate = winRate;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getWinRate() {
        return winRate;
    }

    public void setWinRate(String winRate) {
        this.winRate = winRate;
    }

    @Override
    public String toString() {
        return rank + " " + teamName + " " + winRate;
    }
}
