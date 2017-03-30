package edu.wmich.cs1120.la5;
import java.util.ArrayList;
public class EnergyAnalyzer implements IRover
{
	ArrayList<IArea> path;
	String analysis;
	double total;
	/*
	 * Sets the field path with the
	 * parameter of the same data type
	 */
	public void setPath(ArrayList<IArea> path)
	{
		this.path = path;		
	}

	/*
	 * returns the path field
	 */
	public ArrayList<IArea> getPath()
	{
		return this.path;
	}

	/*
	 * Uses a for loop to add up
	 * all of the Energies of each
	 * IArea object of the path
	 */
	public void analyzePath()
	{
		for(int i=0;i<this.path.size();i++)
		{
			total += this.path.get(i).getBasicEnergyCost();
		}			
	}

	public String getAnalysis()
	{
		return String.valueOf(total);
	}

	public void setAnalysis()
	{
		this.analysis="energy";
	}

}
