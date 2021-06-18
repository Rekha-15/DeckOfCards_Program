/**
 * @purpose Creating a player class.
 * @author rekha
 * @version 1.0
 *@since 17-06-2021
 */

package com;

/**
 * assigning playerName as string
 * @author rekha
 * 
 */
public class Player {
	String playerName;
	int sequenceAdding;

	public int getSequenceNumber() {
		return sequenceAdding;
	}

	public void setSequenceNumber(int sequenceAdding) {
		this.sequenceAdding = sequenceAdding;
	}

	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}
	
	public Player(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}
