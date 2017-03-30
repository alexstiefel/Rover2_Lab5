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
	 * @param The determined path from the GUI
	 */
	public void setPath(ArrayList<IArea> path)
	{
		this.path = path;		
	}

	/*
	 * returns the path field
	 * @return The selected path
	 */
	public ArrayList<IArea> getPath()
	{
		return this.path;
	}

	/*
	 * Uses a for loop to add up
	 * all of the Energies of each
	 * IArea object of the path and
	 * stores the result in the total field
	 */
	public void analyzePath()
	{
		for(int i=0;i<this.path.size();i++)
		{
			total += this.path.get(i).getBasicEnergyCost();
		}			
	}
/*
 * returns the results of the analysis
 * by passing the total to string
 * @return The calculated value of the analyzed values
 */
	public String getAnalysis()
	{
		return String.valueOf(total);
	}
/*
 *Sets the analysis field to the string energy 
 */
	public void setAnalysis()
	{
		this.analysis="energy";
	}
/*
 * Sets the name for the EnergyAnalyzer function in the GUI
 * @return String name of function
 */
public String toString(){
	return "EnergyAnalyzer";
}
}
