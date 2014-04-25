package com.mizzou.acm.android.helpers;

import com.mizzou.acm.android.Grid;

public class GameCheck
{//Checks to see if we have won, lost, or neither.
	//This flag checks to see if the player has already won. If so, we don't want
	//check the win state.
	boolean hasWon;		
	
	public GameCheck()
	{
		hasWon = false;
	}
	
	public States check(Grid grid)
	{		
		//Check the win state first. That way, if the board fills up at the same time,
		//the player will still win. This will only be done if you haven't already won.
		if(!hasWon)
			checkWin(grid);
		
		return States.NEITHER;
	}
	
	private boolean checkWin(Grid grid)
	{
		//Scan for the 2048 tile
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				if(grid.getCellValue(i, j) == 2048)
				{
					//Set the hasWon boolean for future checks
					this.hasWon = true;
					return true;
				}
		
		//If we made it here, we did not win.
		return false;
	}
}