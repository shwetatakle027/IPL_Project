package com.controller;

import java.util.Scanner;

import com.service.PlayerService;

public class ControllerTeam {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        PlayerService service = new PlayerService();
	        
	        System.out.println("Select team: \n 1: CSK \n 2: MI \n 3: RCB \n Enter your choice:"); 
	        int teamChoice = sc.nextInt();
	        
	        switch(teamChoice) {
	            case 1: 
	                RoleSelection(service, "csk");
	                break;
	            case 2: 
	               RoleSelection(service, "mi");
	                break;
	            case 3: 
	                RoleSelection(service, "rcb");
	                break;
	            default:
	                System.out.println("Invalid team choice. Please try again.");
	        }
	        
	        sc.close(); 
	    }

	    private static void RoleSelection(PlayerService service, String team) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Select specification:\n 1: Batsman \n 2: All-Rounder \n 3: Bowler");
	        int roleChoice = sc.nextInt();

	        switch(roleChoice) {
	            case 1:
	                service.getByRole(team, "Batsman");
	                break;
	            case 2:
	                service.getByRole(team, "All-rounder");
	                break;
	            case 3:
	                service.getByRole(team, "Bowler");
	                break;
	            default:
	                System.out.println("Invalid role choice. Please try again.");
	        }
	    }
	}

