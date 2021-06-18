/******************************************************************************
 * Purpose : Implementing Deck Of Cards Game. In this UC2 , Creating the playerTeam class 
 * to add the player from console.
 * @author Rekha
 * @Version 1.0
 * @Since 17-06-2021
 *
 *******************************************************************************/
package com;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.Player;

/**
 * Taking suits, ranks and deck has a String
 * 
 * @author rekha
 *
 */

public class DeckOfCards {

	private String[] suits = new String[] { "CLUB", "DIAMOND", "HEART", "SPADE" };
	private String[] ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private static String[] deck = new String[52];
	

	/**
	 * uniqueCards is a method of private type uniqueCards method created to creates
	 * a deck of cards and to check if all cards are unique or not Creating deck of
	 * cards from symbol and ranks Using HashSet to check if all cards or unique it
	 * will check for cards size, to check if all cards are unique if unique it
	 * will @return deck (cards) or
	 * 
	 * @return null
	 */

	private String[] uniqueCards() {

		for (int i = 0; i < deck.length; i++)
			deck[i] = suits[i / 13] + "->" + ranks[i % 13];

		Set<String> cardsUnique = new HashSet<String>(Arrays.asList(deck));

		if (cardsUnique.size() == deck.length) {
			return deck;
		} else {
			return null;
		}
	}

	/**
	 * playerTeam is a method of private static type
	 * playerTeam function First we asking the count of number of players if number
	 * of players is more then 2 and less then 4 Player can entry there names Player
	 * is an class in class created playerName as an object to assign players name
	 */

	private static void playersTeam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of players ");
		int numberOfPlayers = sc.nextInt();

		if (numberOfPlayers > 2 && numberOfPlayers <= 4) {
			Scanner sc1 = new Scanner(System.in);
			for (int i = 1; i <= numberOfPlayers; i++) {
				System.out.println("Enter player " + i + " name");
				String name = sc1.nextLine();
				Player playerNames = new Player(name);
			}
		} else {
			System.out.println("Minimum 2 players and maximum 4 player count should be there");
			playersTeam();
		}
	}

	/**
	 * Main method of public type
	 * In Main method Created object to call uniqueCards function
	 * calling playersTeam function
	 */

	public static void main(String[] args) {
		DeckOfCards deckCards = new DeckOfCards();
		deckCards.uniqueCards();
		DeckOfCards.playersTeam();

	}

}
