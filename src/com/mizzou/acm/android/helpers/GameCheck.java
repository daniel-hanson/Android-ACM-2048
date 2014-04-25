package com.mizzou.acm.android.helpers;

public class GameCheck
{//Checks to see if we have won, lost, or neither.
	//This flag checks to see if the player has already won. If so, we don't want
	//check the win state.
	boolean hasWon;		
	
	public GameCheck()
	{
		hasWon = false;
	}
	
	public States check()
	{
		States thisState = States.NEITHER;
		
		return thisState;
	}
}