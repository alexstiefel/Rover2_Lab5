package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {

	ArrayList<IArea> path;
	double total;
	String analysis;
	/*
	 *Sets the path field to the determined path
	 *@param the path arrayList from the GUI
	 */
	public void setPath(ArrayList<IArea> path) {
		this.path=path;
		
	}
/*
 * returns the path field
 * @return The determined path
 */
	public ArrayList<IArea> getPath() {
	
		return this.path;
	}

	/*
	 * Uses a for loop to add up
	 * all of the radiations of each
	 * IArea object of the path
	 */
	public void analyzePath() {
		for(int i=0;i<this.path.size();i++){
			total+= this.path.get(i).getRadiation();
		}
		
	}

	/*
	 * returns the results of the analysis
	 * by passing the total to string
	 * @return The total value of the analyzed data passed to a string
	 */
	public String getAnalysis() {
		return  String.valueOf(total);
	}

	
	public void setAnalysis() {
		this.analysis="Radiation";
	}

}
