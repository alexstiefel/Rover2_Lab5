/**
 * This class is responsible for the Rover that goes through the Map
 * It implements the IRover interface
 */
package edu.wmich.cs1120.la5;
import java.util.*;
public class Rover implements IRover
{
	private ArrayList<IArea> pathway = new ArrayList<IArea>();
	
	
	/**
	 * Takes the incoming variables and passes them to the another variable to be sent to another class
	 * @param startRow is the value of the row set by the user
	 * @param startCol is the value of the column set by the user
	 */
	public void setPath (int startRow, int startCol)
	{
		pathway = getMapCreator().getScanner().getPath(startRow, startCol);
	}
	
	/**
	 * @return the ArrayList object that was set in the setPath method
	 */
	public ArrayList<IArea> getPath()
	{
		return pathway;
	}
	
	

	@Override
	public void analyzePath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAnalysis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		
	}
}
/**
 * end of class
 */
