package com.mizzou.acm.android;

public class Grid
{
	private Gravity gravity = null;
	private static final int SIZE = 4;		//How many rows and columns there are in the grid
	
	private Cell[][] cells;
	
	Cell[][] buildGrid()
	{
		Cell[][] cells = new Cell[4][];
		
		for(int x = 0; x < SIZE; x++)
		{
			cells[x] = new Cell[4];
			
			for (int y = 0; y < SIZE; y++)
				cells[x][y] = new Cell();
		}		
		
		return cells;
	}

	private Cell[][] fromState(Cell[][] state)
	{
		Cell[][] cells = buildGrid();
		for(int x = 0; x < SIZE; x++)
		{			
			for (int y = 0; y < SIZE; y++)
			{
				
				cells[x][y] = state[x][y];
			}
		}
		
		return cells;
	}
	
	public int getCellValue(int x, int y)
	{//Get the value of the cell at the given coordinates
		return cells[x][y].getValue();	
	}
	
	private int[] availableCells()
	{
		for(int x = 0; x < SIZE; x++)
			for(int y = 0; y < SIZE; y++)
				if(cells[x][y].getValue() == 0)
				{
					int[] available = {x, y};
					return available;
				}
		
		//If we make it down here, there are no available cells. Might have lost.
		int[] available = {0, 0};
		return available;
	}
	
	private void insertTile(int x, int y)
	{
		cells[x][y] = new Cell();
	}
	
	private void removeTile(int x, int y)
	{//At grid coordinates x,y, set it equal to 0.
		cells[x][y].setValue(0);
	}
	
	public void update(Gravity gravity)
	{//This method is called from the GameLogic. This is all that should be accessible from that class.
		this.gravity = gravity;
		
		
	}
}
