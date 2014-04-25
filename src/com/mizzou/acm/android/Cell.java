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
	private Position position;		//Postion on the screen using grid coordinates. (Example: First cell is [0][0])
	
	private int value = 2;
	
	public Cell()
	{
		
	}
	
	public Cell(Position position, int value)
	{
		this.previousPosition = null;
		this.updatePosition(position);
		this.value = value;
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

function Tile(position, value) {
	  this.x                = position.x;
	  this.y                = position.y;
	  this.value            = value || 2;

	  this.previousPosition = null;
	  this.mergedFrom       = null; // Tracks tiles that merged together
	}

	void savePosition()
	{
		this.previousPosition = { x: this.x, y: this.y };
	}
	
}
