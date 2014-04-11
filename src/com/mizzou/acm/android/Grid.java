package com.mizzou.acm.android;


public class Grid
{
	Gravity gravity = null;
	
	
	Cell[][] buildGrid ()
	{
		ArrayList<ArraryList<Cell>> list = ArrayList<ArrayList<Cell>>();
		
		for(int x = 0; x<SIZE; x++)
		{
			ArrayList<Cell> temp  = new ArrayList<Cell>();
			for (y = 0; y<SIZE; y++)
			{
				temp.add( new Cell());
				list.add(temp);
			}
		}
		return cells;
	}

	Cell [] fromState (state)
	{
		ArrayList<ArrayList<Cell>> list = ArrayList<ArrayList<Cell>>();
		{
			for(int x = 0; x < SIZE; x++)
			{
				ArrayList<Cell> temp = new ArrayList<Cell>();
				for(int y = 0; y < SIZE; y++)
				{
					Boolean tile = state[x][y];
					temp.add(tile ? new Cell(cell.position,cell.value) : new Cell());
					list.add(temp);
				
				}
			}
		}
		return cells;
	}	

	Cell[] findRand ()
	{
		
	}














}





