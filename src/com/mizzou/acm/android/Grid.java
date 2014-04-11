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
<<<<<<< HEAD
		
		return cells;
	}
=======
		}
		return cells;
	}	
>>>>>>> f96f2ea70a7120d79e9bc9181d1c4648a8eb6ae6
}
