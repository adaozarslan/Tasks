package dev.ada.execution;

import java.util.Scanner;

public class Task2 {

	/*
	 * 
	 * Author: Ada Ozarslan 
	 * Date: 2th of February 2021
	 * Github:https://github.com/adaozarslan
	 * 
	 * 
	 */
	
	public static void main(String[] args) {

		// Introduction and brief explanation of the game
		System.out.println("          ..... Welcome to Rock Paper Scissors Game .....          ");
		System.out.println();
		System.out.println("A brief explanation for the game if not known:");
		System.out.println();
		System.out.println("-Both players have to say either Rock, Paper or Scissors at the same time.");
		System.out.println();
		System.out.println("*Rock X Scissors  = Rock wins!");
		System.out.println("*Paper X Rock     = Paper wins!");
		System.out.println("*Scissors X Paper = Scissors wins!");
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
		System.out.println();

		String r = "rock";
		String p = "paper";
		String s = "scissors";

		boolean quit = false; // to loop the game forever

		// scanner for player name input
		Scanner console = new Scanner(System.in);

		System.out.println("Please enter your name");
		System.out.println();

		System.out.print("Player 1 : ");
		String player1 = console.nextLine();
		System.out.print("Player 2 : ");
		String player2 = console.nextLine();

		System.out.println();
		System.out.println("--------------------------Game is Starting----------------------------");
		System.out.println();

		while (!quit) {// to loop the game forever

			// scanner for player move input
			System.out.println(player1 + " Make your move : ");
			String moveP1 = console.nextLine();

			System.out.println();

			System.out.println(player2 + " Make your move : ");
			String moveP2 = console.nextLine();

			// Winning conditions & results
			if (moveP1.equals(moveP2)) {
				System.out.println();
				System.out.println("Tie!!");

			} else if (moveP1.equals(r) && moveP2.equals(p)) {
				System.out.println();
				System.out.println("Paper eats Rock");
				System.out.println(player2 + " Wins!!");

			} else if (moveP1.equals(r) && moveP2.equals(s)) {
				System.out.println();
				System.out.println("Rock crashes Scissors");
				System.out.println(player1 + " Wins!!");

			} else if (moveP1.equals(p) && moveP2.equals(r)) {
				System.out.println();
				System.out.println("Paper eats Rock");
				System.out.println(player1 + " Wins!!");

			} else if (moveP1.equals(p) && moveP2.equals(s)) {
				System.out.println();
				System.out.println("Scissors cut Paper");
				System.out.println(player2 + " Wins!!");

			} else if (moveP1.equals(s) && moveP2.equals(r)) {
				System.out.println();
				System.out.println("Rock crashes Scissors");
				System.out.println(player2 + " Wins!!");

			} else if (moveP1.equals(s) && moveP2.equals(p)) {
				System.out.println();
				System.out.println("Scissors cut Paper");
				System.out.println(player1 + " Wins!!");

			} else {
				System.out.println();
				System.out.println("Invalid entry, please write rock, paper or scissors");
			}

			System.out.println();
			System.out.println();
		}

	}
}
