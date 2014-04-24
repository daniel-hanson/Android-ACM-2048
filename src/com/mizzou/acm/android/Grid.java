package com.mizzou.acm.android;

import java.util.ArrayList;


public class Grid
{
	Gravity gravity = null;
	private static final int SIZE = 4;		//How many rows and columns there are in the grid
	
	Cell[][] buildGrid ()
	{
		Cell[][] list = new Cell[4][4];
		
		for(int x = 0; x < SIZE; x++)
		{
			cells[x] temp = new ArrayList<Cell>();
			for (int y = 0; y < SIZE; y++)
				temp.add(new Cell());
			
			list.add(temp);
		}		
		
		return list;
	}

	Cell[][] fromState(Cell[][] state)
	{
		Cell[][] cells = buildGrid();
		for(int x = 0; x < SIZE; x++)
		{			
			for (int y = 0; y < SIZE; y++)
			{
				
				cells.get(x).get(y) = state[x][y];
				//Cell cells[x][y] = (tile ? new Tile(tile.position, tile.value): new Cell());
				
			}
			
		}
		
		return cells;
	}	
}
