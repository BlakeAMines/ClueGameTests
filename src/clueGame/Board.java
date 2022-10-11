package clueGame;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;

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
	
	public void loadLayoutConfig() throws BadConfigFormatException
	{
		int countRows = 0;
		int countCols = 0;
		
		System.out.println(layoutConfigFile);
		
		String curLine = "";
		
		try
		{
			FileReader readFile = new FileReader(layoutConfigFile);
			Scanner fileIn = new Scanner(readFile);
			
			curLine = fileIn.nextLine();
			String[] rowList = curLine.split(",", 0);
			
			countCols = rowList.length;
			
			while(fileIn.hasNextLine())
			{
				curLine = fileIn.nextLine();
				
				rowList = curLine.split(",", 0);
				
				if(rowList.length != countCols)
				{
					throw new BadConfigFormatException();
					
				} //end if 
				
				for(int i = 0; i < rowList.length; i++)
				{
					System.out.print(rowList[i] + " ");					
					
				} //end for
				
				System.out.println("");
				
			} //end while
		
		} //end try
		
		catch(FileNotFoundException fileError)
		{
			System.out.println("Handle this more legitimately...");
			
		} //end catch
		
	} //end loadLayoutConfig
	
	public static Board getInstance()
	{
		return theInstance;
		
	} //end getInstance
	
	public void setConfigFiles(String csvName, String txtName)
	{
		layoutConfigFile = "data/" + csvName;
		setupConfigFile = "data/" + txtName;
		
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
