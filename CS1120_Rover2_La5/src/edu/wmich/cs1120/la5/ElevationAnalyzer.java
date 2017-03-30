package edu.wmich.cs1120.la5;
import java.util.ArrayList;
public class ElevationAnalyzer implements IRover
{
	ArrayList<IArea> path;
	MapCreatorFromTxt field;
	
	/*
	 * Sets the Field path with an 
	 * array list returned from the TerrainScanner object
	 *@param 
	 */
	public void setPath(ArrayList<IArea> path)
	{
		this.path = field.getScanner().getPath(startRow, startColumn);	
	}

	/*
	 * returns the field path which
	 * is an array list of IArea objects
	 */
	public ArrayList<IArea> getPath()
	{
		return this.path;
	}

	/*
	 * Uses a for loop to add up
	 * all of the elevations of each
	 * IArea object of the path
	 */
	public void analyzePath()
	{
		double totalElevation = 0;
		
		for(int i=0;i<this.path.size();i++)
		{
			totalElevation+= this.path.get(i).getElevation();
		}		
	}

	public String getAnalysis()
	{
		
		return null;
	}

	public void setAnalysis()
	{
		
		
	}

}
