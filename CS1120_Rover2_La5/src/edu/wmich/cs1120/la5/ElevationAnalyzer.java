package edu.wmich.cs1120.la5;
import java.util.ArrayList;
public class ElevationAnalyzer implements IRover
{
	ArrayList<IArea> path;
	String analysis;
	double total;
	/*
	 * Sets the Field path with an 
	 * array list returned from the TerrainScanner object
	 *@param the array list of the designated path
	 */
	public void setPath(ArrayList<IArea> path)
	{
		this.path = path;	
	}

	/*
	 * returns the field path which
	 * is an array list of IArea objects
	 * @return The path field
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
	
		
		for(int i=0;i<this.path.size();i++)
		{
			total+= this.path.get(i).getElevation();
		}		
	}
	/*
	 * returns the results of the analysis
	 * by passing the total to string
	 * @return the calculated sum of the analyzed data
	 */
	public String getAnalysis()
	{
		
		return  String.valueOf(total);
	}
/*
 * sets the analysis field to the string elevation
 */
	public void setAnalysis()
	{
		this.analysis="elevation";
		
	}


}
