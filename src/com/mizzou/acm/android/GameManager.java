/* This is the game manager class. It deals with all the rendering and updating.
 * The game will not update until a gesture is made. These finite states
 * make the logic in the game much easier to understand.
 * When a gesture is made:
 * The update will be called first. The render is called afterward. 
 * After the above two, the state will be checked to see if we have won or lost.
 * Full board = Lose.
 * 2048 Tile Existing = Win. -->User may continue on or reset.
 */
package com.mizzou.acm.android;

import com.mizzou.acm.android.helpers.GameCheck;
import com.mizzou.acm.android.helpers.GameLogic;
import com.mizzou.acm.android.helpers.GameRender;
import com.mizzou.acm.android.helpers.States;

public class GameManager
{
	private GameLogic logic;
	private GameRender render;
	private GameCheck check;
	
	public GameManager()
	{//Manager the actual game. Logic is called in the correct order
		this.reset();
	}
	
	public void reset()
	{//Reset everything
		//Re-initialize helpers => This will also reset the game and all related fields
		this.initializeHelpers();
	}

	private void initializeHelpers()
	{//Initialize the three helpers.
		logic = new GameLogic();
		render = new GameRender();
		check = new GameCheck();
	}
	
	public void startGameLoop()
	{//Game runs here
		//Run until we close.
		boolean running = true;
		while(running)
		{//Logic: Update, Render, Check. There is a class for each of these.
			//Run the game logic
			Grid newGrid = logic.update(Gravity.UP);
			
			//Run the rendering
			render.render(newGrid, logic.getScore());
			
			//Get the current state of the game after the last update
			States state = check.check(newGrid);
			
			//After setting the state, check it and make a decision
			
			switch (state)
			{
				case LOSE:
					//Do the lose method here
					
					break;
				case WIN:
					//Do the win method here
					
					break;
				case NEITHER:
					//Game is still going. Keep playing
					
					break;
							
			}
		}
	}
}
