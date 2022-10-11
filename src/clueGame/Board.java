package clueGame;

import java.util.Map;

public class Board 
{
	private BoardCell[][] grid;
	
	private int numRows;
	private int numColumns;
	
	private String layoutConfigFile;
	private String setupConfigFile;
	
	private Map<Character, Room> roomMap;
	
	static Board theInstance = new Board();
	
	private Board()
	{
        super() ;
        
	} //end constructor
	
	public void initialize()
	{
		
		
	} //end initialize
	
	public void loadSetupConfig()
	{
		
		
	} //end loadSetupConfig
	
	public void loadLayoutConfig()
	{
		
		
	} //end loadLayoutConfig
	
	public static Board getInstance()
	{
		return theInstance;
		
	} //end getInstance
	
	public void setConfigFiles(String csvName, String txtName)
	{
		layoutConfigFile = csvName;
		setupConfigFile = txtName;
		
	} //end setConfigFiles
	
	//Overloading
	public Room getRoom(char roomLabel)
	{
		//test data
		return new Room();
		//end test data
		
	} //end getRoom
	
	//Overloading
	public Room getRoom(BoardCell cell)
	{
		//test data
		return null;
		//end test data
		
	} //end getRoom
	
	public BoardCell getCell(int row, int col)
	{
		//test data
		return new BoardCell();
		//end test data
		
	} //end getCell
	
	public int getNumColumns()
	{
		return numColumns;
		
	} //end getNumCols
	
	public int getNumRows()
	{
		return numRows;
		
	} //end getNumRows
		
} //end Board
