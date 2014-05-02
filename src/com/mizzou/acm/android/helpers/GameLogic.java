//This is the class that controls all the game logic
//From the main Android activity, we will first look for a gesture.
//The gesture tells the manager we want an update. 
//We will call the update in this class.
//After the game update, we will render the drawing for the game's current state.
package com.mizzou.acm.android.helpers;

import com.mizzou.acm.android.Grid;

public class GameLogic
{
	//This class will hold and act upon the grid
	private Grid grid;
	
	//Game score is changed from here
	private int score;
	
	public GameLogic()
	{
		reset();
	}
	  
	public void reset()
	{
		//Create a new grid
		grid = new Grid();
		
		//Reset Score
		score = 0;
	}
	  
	public Grid getGrid()
	{//Use this getter to get the grid. This will be useful for the drawing and checking phases
		return this.grid;
	}
	
	public int getScore()
	{//When rendering, call this to get the score
		return this.score;
	}
	
	
}
