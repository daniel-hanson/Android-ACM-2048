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

public class GameManager
{
	public GameManager()
	{//Constructor creates the actual game. Logic is called in the correct order
		
	}
	
}
