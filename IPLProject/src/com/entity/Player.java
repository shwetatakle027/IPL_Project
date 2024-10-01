package com.entity;

public class Player {
	private String name;
    private String team;
    private int wicket;
    private int run;
    private int jerseyNumber;
    private String role;

    public Player(String name, String team, int wicket, int run, int jerseyNumber, String role) {
        this.name = name;
        this.team = team;
        this.wicket = wicket;
        this.run = run;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getRun() {
        return run;
    }

    public int getWicket() {
        return wicket;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", run=" + run +
                ", wicket=" + wicket +
                ", jerseyNumber=" + jerseyNumber +
                ", role='" + role + '\'' +
                '}';
    }   
}

	 
	   