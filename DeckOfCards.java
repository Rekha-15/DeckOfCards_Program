/******************************************************************************
 * Purpose : Implementing Deck Of Cards Game.
 * @author Rekha
 * @Version 1.0
 * @Since 17-06-2021
 *
 *******************************************************************************/
package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Taking suits, ranks and deck has a String
 * @author rekha
 *
 */


public class DeckOfCards {
	
	private  String[] suits = new String[] { "CLUB", "DIAMOND", "HEART", "SPADE" };
	private  String[] ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private static  String[] deck = new String[52];
	
	/**
	 * uniqueCards is a method of private type
	 * uniqueCards method created to creates a deck of cards and to check if all cards are unique or not
	 * Creating deck of cards from symbol and ranks
	 * Using HashSet to check if all cards or unique 
	 * it will check for cards size, to check if all cards are unique
	 * if unique it will @return deck (cards) or
	 * @return null
	 */
	
	private String[] uniqueCards() {
		
		for (int i = 0; i < deck.length; i++)
			deck[i] = suits[i / 13] + "->" + ranks[i % 13];
		
		Set<String> cardsUnique = new HashSet<String>(Arrays.asList(deck));
		
		if(cardsUnique.size()==deck.length) {
			return deck;
		}
		else {
			return null;
		}
	}

	/**
	 * Main method
	 *Created object to call uniqueCards function
	 */
	
	public static void main(String[] args) {
		DeckOfCards deckCards = new DeckOfCards();
		deckCards.uniqueCards();
		
	}

}
