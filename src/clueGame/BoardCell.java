package clueGame;

import java.util.Set;

public class BoardCell 
{
	private int row;
	private int col;
	
	char initial;
	
	private DoorDirection doorDirection;
	
	private boolean roomLabel;
	private boolean roomCenter;
	
	private char secretPassage;
	
	private Set<BoardCell> adjList;
	
	//Default constructor only used for testing
	public BoardCell()
	{
		
		
	} //end default constructor
	
	public void addAdj(BoardCell adjCell)
	{
		
		
	} //end addAdj
	
	public DoorDirection getDoorDirection()
	{
		return doorDirection;
		
	} //end getDoorDirection
	
	public boolean isDoorway()
	{
		//test data
		return false;
		
		//end test data
		
	} //end isDoorway

	public boolean isLabel() 
	{
		// TODO Auto-generated method stub
		return false;
		
	} //end isLabel

	public boolean isRoomCenter() 
	{
		// TODO Auto-generated method stub
		return false;
		
	} //end isRoomCenter

	public char getSecretPassage() 
	{
		// TODO Auto-generated method stub
		return 0;
		
	} //end getSecretPassage
	
} //end BoardCell
