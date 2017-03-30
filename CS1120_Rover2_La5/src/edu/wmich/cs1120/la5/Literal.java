/**
 * This method is responsible for getting the value from data and returning them
 * Implements IExpression interface
 */
package edu.wmich.cs1120.la5;
public class Literal implements IExpression
{
	private int value;
	
	/**
	 * Literal constructor
	 * @param value is the incoming value from data
	 */
	public Literal(int value)
	{
		this.value = value;
	}
	
	/**
	 * @return the incoming value as an object
	 */
	public Integer getValue()
	{
		return this.value;
	}
}
/**
 * end of class
 */
