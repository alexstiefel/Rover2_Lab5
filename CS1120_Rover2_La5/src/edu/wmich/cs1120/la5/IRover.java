/**
 * Interface for the Rover class
 */
package edu.wmich.cs1120.la5;
import java.util.ArrayList;
public interface IRover
{
	
	/**
	 * Takes the incoming variables and passes them to the another variable to be sent to another class
	 * @param startRow is the value of the row set by the user
	 * @param startCol is the value of the column set by the user
	 */
	public void setPath (ArrayList<IArea> path);
	
	/**
	 * @return the ArrayList object that was set in the setPath method
	 */
	public ArrayList<IArea> getPath();
	
	/**
	 * Calculates the total value of the energy consumed in each area
	 * @return the total value
	 */
	public void analyzePath();

	
public String getAnalysis();

public void setAnalysis();

public String toString();
}
/**
 * end of interface
 */
