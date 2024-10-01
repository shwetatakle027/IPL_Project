package com.daao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Player;

public class PlayersData {
	public ArrayList<Player> cskTeamData() {
        ArrayList<Player> cskplayers = new ArrayList<>();
        cskplayers.add(new Player("MS Dhoni", "csk", 0, 5000, 7, "Batsman"));
        cskplayers.add(new Player("Ravindra Jadeja", "csk", 150, 3000, 8, "All-rounder"));
        cskplayers.add(new Player("Ruturaj Gaikwad", "csk", 0, 1300, 31, "Batsman"));
        cskplayers.add(new Player("Devdutt Padikkal", "csk", 0, 800, 21, "Batsman"));
        cskplayers.add(new Player("Moeen Ali", "csk", 40, 1200, 28, "All-rounder"));
        cskplayers.add(new Player("Deepak Chahar", "csk", 70, 350, 31, "Bowler"));
        cskplayers.add(new Player("Shivam Dube", "csk", 0, 500, 24, "All-rounder"));
        cskplayers.add(new Player("Maheesh Theekshana", "csk", 15, 100, 56, "Bowler"));
        cskplayers.add(new Player("Tushar Deshpande", "csk", 20, 50, 27, "Bowler"));
        cskplayers.add(new Player("Dwaine Pretorius", "csk", 30, 200, 14, "All-rounder"));
        cskplayers.add(new Player("Simarjeet Singh", "csk", 5, 10, 51, "Bowler"));
        return cskplayers;
    }

    public ArrayList<Player> miTeamData() {
    	
    	    ArrayList<Player> miPlayers = new ArrayList<>();
    	    miPlayers.add(new Player("Rohit Sharma", "mi", 0, 6000, 45, "Batsman"));
    	    miPlayers.add(new Player("Ishan Kishan", "mi", 0, 2500, 30, "Batsman"));
    	    miPlayers.add(new Player("Suryakumar Yadav", "mi", 0, 3200, 12, "Batsman"));
    	    miPlayers.add(new Player("Hardik Pandya", "mi", 50, 2000, 28, "All-rounder"));
    	    miPlayers.add(new Player("Kieron Pollard", "mi", 30, 3000, 55, "All-rounder"));
    	    miPlayers.add(new Player("Jasprit Bumrah", "mi", 120, 100, 93, "Bowler"));
    	    miPlayers.add(new Player("Trent Boult", "mi", 90, 80, 25, "Bowler"));
    	    miPlayers.add(new Player("Rahul Chahar", "mi", 75, 50, 23, "Bowler"));
    	    miPlayers.add(new Player("Tim David", "mi", 0, 1200, 21, "Batsman"));
    	    miPlayers.add(new Player("Dewald Brevis", "mi", 0, 500, 43, "Batsman"));
    	    miPlayers.add(new Player("Akash Madhwal", "mi", 30, 20, 29, "Bowler"));
    	    return miPlayers;
    	}

    	
    	
        
 

    public ArrayList<Player> rcbTeamData() {
 
    	    ArrayList<Player> rcbPlayers = new ArrayList<>();
    	    rcbPlayers.add(new Player("Virat Kohli", "rcb", 0, 6000, 18, "Batsman"));
    	    rcbPlayers.add(new Player("Faf du Plessis", "rcb", 0, 4000, 9, "Batsman"));
    	    rcbPlayers.add(new Player("Glenn Maxwell", "rcb", 30, 2500, 36, "All-rounder"));
    	    rcbPlayers.add(new Player("Dinesh Karthik", "rcb", 0, 2200, 14, "Wicketkeeper-Batsman"));
    	    rcbPlayers.add(new Player("Shahbaz Ahmed", "rcb", 20, 800, 15, "All-rounder"));
    	    rcbPlayers.add(new Player("Mohammed Siraj", "rcb", 40, 150, 18, "Bowler"));
    	    rcbPlayers.add(new Player("Harshal Patel", "rcb", 50, 200, 8, "Bowler"));
    	    rcbPlayers.add(new Player("Wanindu Hasaranga", "rcb", 60, 100, 22, "All-rounder"));
    	    rcbPlayers.add(new Player("Josh Hazlewood", "rcb", 70, 40, 26, "Bowler"));
    	    rcbPlayers.add(new Player("Anuj Rawat", "rcb", 0, 300, 17, "Wicketkeeper-Batsman"));
    	    rcbPlayers.add(new Player("David Willey", "rcb", 50, 1200, 30, "All-rounder"));
    	    return rcbPlayers;
    }

    public List<Player> getByRole(String team, String role) {
        List<Player> playersByRole = new ArrayList<>();
        ArrayList<Player> players = new ArrayList<>();
        
       
        if (team.equalsIgnoreCase("csk")) {
            players = cskTeamData();
        } else if (team.equalsIgnoreCase("mi")) {
            players = miTeamData();
        } else if (team.equalsIgnoreCase("rcb")) {
            players = rcbTeamData();
        }

        for (Player player : players) {
            if (player.getRole().equalsIgnoreCase(role)) {
                playersByRole.add(player);
            }
        }
        return playersByRole;
    }
}
