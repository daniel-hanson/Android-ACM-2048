/* This class will deal with the drawing of the game after its state has been updated.
   Call the render() method after you have finished updating.
*/
package com.mizzou.acm.android.helpers;

import com.mizzou.acm.android.Cell;
import com.mizzou.acm.android.Grid;

public class GameRender
{
	public void render(Grid grid, int score)
	{//Drawing done here
		//Draw the background
		
		
		//Draw the grid
		
		
		//Draw all the cells
		
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
			{//Each cell will have its own color related to the number.
				//If value is 0, do the blank art. Otherwise, do the value art
				if(grid.getCellValue(i, j) == 0)
					ArtHelper.get(Cell.class, 0);
			}
	}
}
