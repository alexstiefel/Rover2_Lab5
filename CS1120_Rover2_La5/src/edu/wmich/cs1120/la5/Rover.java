/**
 * This class is responsible for the Rover that goes through the Map
 * It implements the IRover interface
 */
package edu.wmich.cs1120.la5;
import java.util.*;
public class Rover implements IRover
{
	private MapCreator mc;
	private ArrayList<Area> pathway = new ArrayList<Area>();
	
	/**
	 * Rover class constructor
	 * Creates a MapCreator object
	 */
	public Rover()
	{
		this.mc = new MapCreator();
	}
	
	/**
	 * Sets the incoming object of MapCreator to the existing object
	 * @param is the object of the class MapCreator
	 */
	public void setMapCreator(MapCreator mc)
	{
		this.mc = mc;
	}
	
	/**
	 * @return the object MapCreator
	 */
	public MapCreator getMapCreator()
	{
		return this.mc;
	}
	
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
	public ArrayList<Area> getPath()
	{
		return pathway;
	}
	
	/**
	 * Calculates the total value of the energy consumed in each area
	 * @return the total value
	 */
	public double calculateEnergy()
	{
		double sum = 0;
		
		for (int i = 0; i < pathway.size(); i++)
		{
			sum += pathway.get(i).calcConsumedEnergy();
		}
		
		return sum;
	}
}
/**
 * end of class
 */
