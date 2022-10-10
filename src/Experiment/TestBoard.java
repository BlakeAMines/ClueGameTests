package Experiment;

import java.util.HashSet;
import java.util.Set;

public class TestBoard 
{		
	final static int ROWS = 4;
	final static int COLS = 4;
	
	private TestBoardCell grid[][];
	
	public TestBoard()
	{
		grid = new TestBoardCell[ROWS][COLS];
		
		for(int i = 0; i < ROWS; i++)
		{
			for(int j = 0; j < COLS; j++)
			{
				grid[i][j] = new TestBoardCell(i, j);
				
			} //end nested for 
			
		} //end for
		
	} //end constructor
	
	public void calcTargets(TestBoardCell startCell, int pathLength)
	{
		return;
		
	} //end CalcTargets
	
	public Set<TestBoardCell> getTargets()
	{
		//Test Data
			return new HashSet<TestBoardCell>();
			
		//End Test Data
			
	} //end getTargets
	
	public TestBoardCell getCell(int row, int col)
	{
		//Test Data
			return grid[row][col];
			
		//End Test Data
		
	} //end getCell
	
	public void calcAdjList(TestBoardCell cell)
	{
		int incr = 1;
		
		for(int i = 0; i < 2; i++)
		{
			incr *= -1;
						
			if((cell.getRow() + incr) >= 0 && cell.getRow() + incr < ROWS)
			{
				cell.addAdjacency(this.getCell(cell.getRow() + incr, cell.getCol()));
				
			} //end nested if
			
			if(cell.getCol() + incr >= 0 && cell.getCol() + incr < COLS)
			{
				cell.addAdjacency(this.getCell((cell.getRow()), (cell.getCol() + incr)));
				
			} //end nested if
			
		} //end for 
		
	} //end calcAdjList
	
} //end TestBoard
