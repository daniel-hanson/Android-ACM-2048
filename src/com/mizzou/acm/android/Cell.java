package com.mizzou.acm.android;


public class Cell
{
	private static final int WIDTH = 25;
	private static final int HEIGHT = WIDTH;
	
	private int x;
	private int y;
	
	private int value = 2;
	
	void updatePosition(int x, int y)
	{
	  this.x = x;
	  this.y = y;
	}
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
	};

	
