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

public class GameManager
{
	private GameLogic logic;
	private GameRender render;
	private GameCheck check;
	
	public GameManager()
	{//Manager the actual game. Logic is called in the correct order
		this.initializeHelpers();
	}
	
	public void reset()
	{//Reset everything
		//Re-initialize helpers
		initializeHelpers();
		
		//Reset Score
		
		
		//Reset board
		
	}

	private void initializeHelpers()
	{//Initialize the three helpers.
		logic = new GameLogic();
		render = new GameRender();
		check = new GameCheck();
	}
}
