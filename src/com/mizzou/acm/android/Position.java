package com.mizzou.acm.android;


public class Position
{
	//This class holds where the tile is in the grid.
	//Example: At x = 2 and y = 2:
	//[] [] []
	//[] [] []
	//[] [] [X]
	public int x;
	public int y;
	
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
