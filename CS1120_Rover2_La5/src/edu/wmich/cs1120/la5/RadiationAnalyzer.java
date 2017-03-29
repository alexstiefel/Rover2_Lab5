package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {

	ArrayList<IArea> path;
	
	
	
	public void setPath(ArrayList<IArea> path) {
		this.path=path;
		
	}
/*
 * returns the path field
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
		double totalRadiation = 0;
		for(int i=0;i<this.path.size();i++){
			totalRadiation+= this.path.get(i).getRadiation();
		}
		
	}

	
	public String getAnalysis() {
		return null;
	}

	
	public void setAnalysis() {
		
	}

}
