package com.mizzou.acm.android;


public class Grid
{
	Gravity gravity = null;
	
	
	Cell[] buildGrid ()
	{
		Cell cells[4][4];
		int y=0;
		for(int x = 0; x<4; x++)
		{
			 
			for (y = 0; y<4; y++)
			{
				cells[x][y] = new Cell();
			}
		}
		return cells;
	}

	Cell [] fromState (state)
	{
		Cell cells [4][4];
		int y=0;
		for(int x = 0; x<4; x++)
		{
			
			for(y = 0; y < 4; y++)
			{
				Cell tile[x][y] = state[x][y];
				Cell cells[x][y] = (tile ? new Tile(tile.position, tile.value): new Cell());
				
			}
		}
		return cells;
	}	
}
