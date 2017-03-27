/**
 * Interface for the Area class
 */
package edu.wmich.cs1120.la5;
public interface IArea
{
	/**
	 * sets the variable basicEnergyCost
	 * @param basicEnergyCost is the first value taken from text file
	 */
	public void setBasicEnergyCost(double basicEnergyCost);
	
	/**
	 * @return the value of basicEnergyCost
	 */
	public double getBasicEnergyCost();
	
	/**
	 * sets the variable elevation
	 * @param elevation is the first value taken from text file
	 */
	public void setElevation(double elevation);
	
	/**
	 * @return the value of elevation
	 */
	public double getElevation();
	
	/**
	 * sets the variable radiation
	 * @param radiation is the first value taken from text file
	 */
	public void setRadiation(double radiation);
	
	/**
	 * @return the value of radiation
	 */
	public double getRadiation();
	
	/**
	 * @return the value of the calculated consumed energy
	 */
	public double calcConsumedEnergy();
}
/**
 * end of interface
 */
