package com.service;

	import java.util.ArrayList;
import java.util.List;

import com.daao.PlayersData;
import com.entity.Player;

	public class PlayerService {
	    PlayersData pd = new PlayersData();

	    public void getByRole(String team, String role) {
	        List<Player> playersByRole = pd.getByRole(team, role);
	        if (playersByRole.isEmpty()) {
	            System.out.println("No players found for this role: " + role);
	        } else {
	            System.out.println("Players with role " + role + ":");
	            for (Player player : playersByRole) {
	                System.out.println(player);
	            }
	        }
	    }
	}

