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
