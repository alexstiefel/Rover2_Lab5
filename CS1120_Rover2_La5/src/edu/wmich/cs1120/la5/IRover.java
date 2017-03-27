/**
 * Interface for the Rover class
 */
package edu.wmich.cs1120.la5;
import java.util.ArrayList;
public interface IRover
{
	
	/**
	 * Sets the incoming object of MapCreator to the existing object
	 * @param is the object of the class MapCreator
	 */
	public void setMapCreator(MapCreator mc);
	
	/**
	 * @return the object MapCreator
	 */
	public MapCreator getMapCreator();
	
	/**
	 * Takes the incoming variables and passes them to the another variable to be sent to another class
	 * @param startRow is the value of the row set by the user
	 * @param startCol is the value of the column set by the user
	 */
	public void setPath (int startRow, int startCol);
	
	/**
	 * @return the ArrayList object that was set in the setPath method
	 */
	public ArrayList<Area> getPath();
	
	/**
	 * Calculates the total value of the energy consumed in each area
	 * @return the total value
	 */
	public double calculateEnergy();
}
/**
 * end of interface
 */
