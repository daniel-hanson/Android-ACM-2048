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
		
		//Check loss next. Board must be filled, and there cannot be any available moves.
		checkLoss(grid);
		
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
	
	private boolean checkLoss(Grid grid)
	{//Check all the tiles around each tile to see if we can move anywhere.
		//We want to loop through each cell and check the surrounding cells.
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
			{
				//Get the current value
				int value = grid.getCellValue(i, j);
				
				//Get the value of up, left, down, and right cells. Error-checking done
				//in getCellValue function
				int up = grid.getCellValue(i - 1, j);
				int down = grid.getCellValue(i + 1, j);
				int left = grid.getCellValue(i, j - 1);
				int right = grid.getCellValue(i, j + 1);
				
				//If any of those are the same as value, you haven't lost
				if(value == up || value == down || value == left || value == right)
					return false;
			}
		
		//If we made it here, we have lost.
		return true;
	}
}