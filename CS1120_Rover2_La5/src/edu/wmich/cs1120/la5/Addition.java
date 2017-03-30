/**
 * This class is responsible for the addition operation
 * It implements IOperation
 */
package edu.wmich.cs1120.la5;
public class Addition implements IOperation
{
	/**
	 * This method performs the addition
	 * @param left is the object from IExpression which is the first value
	 * @param right is the object from IExpression which is the second value
	 * @return the total sum of the left and right
	 */
	public Integer perform(IExpression left, IExpression right)
	{
		return (left.getValue() + right.getValue());
	}
}
/**
 * end of class
 */
