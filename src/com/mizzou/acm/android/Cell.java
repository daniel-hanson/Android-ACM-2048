/* The Cell class holds information about each numbered tile in the game.
 * This will be what moves around the board.
 */
 
package com.mizzou.acm.android;

public class Cell
{
	private static final int WIDTH = 25;
	private static final int HEIGHT = WIDTH;
	
	private int x;		//Physical location of the cell on the screen
	private int y;
	
	private Position previousPosition;
	private Position position;		//Position on the screen using grid coordinates. (Example: First cell is [0][0])
	
	private int value = 2;
	private int mergedFrom;
	
	public Cell()
	{
		this(new Position(0, 0), 2);
	}
	
	public Cell(Position position, int value)
	{
		this.previousPosition = null;
		this.updatePosition(position);
		this.value = value;
		
		this.x = position.x;
		this.y = position.y;
		this.value = value;
		
		this.previousPosition = null;
		this.mergedFrom = 1; // Tracks tiles that merged together
	}
	
	public void updatePosition(Position position)
	{
	  this.position = position;	  
	  this.updateXY();
	}
	
	private void updateXY()
	{//Given the position, update the physical location on the screen
		//This can be done by getting the X and Y position of the grid, moving forward by (size of the gap) * (position + 1)
	}

	void savePosition()
	{
		this.previousPosition = position;
	}
	
}
