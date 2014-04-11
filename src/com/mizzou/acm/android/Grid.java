package com.mizzou.acm.android;


public class Grid
{
	Gravity gravity = null;
	private static final int SIZE = 4;		//How many rows and columns there are in the grid
	
	Cell[][] buildGrid ()
	{
		Cell cells[][] = new Cell[SIZE][SIZE];
		for(int x = 0; x < SIZE; x++)
			for (int y = 0; y < SIZE; y++)
				cells[x][y] = new Cell();
		
		return cells;
	}

	Cell[][] fromState(Cell[][] state)
	{
		Cell cells[][] = buildGrid();
		for(int x = 0; x < SIZE; x++)
			for (int y = 0; y < SIZE; y++)
			{
				cells[x][y] = state[x][y];
				//Cell cells[x][y] = (tile ? new Tile(tile.position, tile.value): new Cell());
				
			}
		
		return cells;
	}
}
