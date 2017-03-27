/**
 * This class is responsible for the elements of each box in the grid if it is a High Area
 * It extends class Area
 */
package edu.wmich.cs1120.la5;
public class HighArea extends Area
{
	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	/**
	 * HighArea class constructor
	 * assigns incoming variables to the already existing variables
	 * @param basicEnergyCost is the first value taken from the text file
	 * @param elevation is the second value taken from the text file
	 * @param radiation is the third value taken from the text file
	 */
	public HighArea(double basicEnergyCost, double elevation, double radiation)
	{		
		super(basicEnergyCost, elevation, radiation);
		
		this.basicEnergyCost = basicEnergyCost;
		this.elevation = elevation;
		this.radiation = radiation;
	}
	
	/**
	 * Sets the incoming value of basicEnergyCost to the existing variable
	 * Overrides super class method
	 * @param basicEnergyCost is the first value taken from the text file
	 */
	public void setBasicEnergyCost(double basicEnergyCost)
	{
		this.basicEnergyCost = basicEnergyCost;
	}
	
	/**
	 * @return the value of the basicEnergyCost
	 */
	public double getBasicEnergyCost()
	{
		return this.basicEnergyCost;
	}
	
	/**
	 * Sets the incoming value of elevation to the existing variable
	 * Overrides super class method
	 * @param elevation is the first value taken from the text file
	 */
	public void setElevation(double elevation)
	{
		this.elevation = elevation;
	}
	
	/**
	 * @return the value of the elevation
	 */
	public double getElevation()
	{
		return this.elevation;
	}
	
	/**
	 * Sets the incoming value of radiation to the existing variable
	 * Overrides super class method
	 * @param radiation is the first value taken from the text file
	 */
	public void setRadiation(double radiation)
	{
		this.radiation = radiation;
	}
	
	/**
	 * @return the value of the radiation
	 */
	public double getRadiation()
	{
		return this.radiation;
	}
	
	/**
	 * @return the value of the calculated consumed energy
	 * Overrides super class method
	 */
	public double calcConsumedEnergy()
	{
		double consumedEnergy = getBasicEnergyCost() * 4;
		return consumedEnergy;
	}
}
/**
 * end of class
 */
