/**
 * This class is responsible for the subtraction operation
 */
package edu.wmich.cs1120.la5;
public class Subtraction implements IOperation
{
	/**
	 * This method performs the subtraction
	 * @param left is the object from IExpression which is the first value
	 * @param right is the object from IExpression which is the second value
	 * @return the difference of the left and right
	 */
	public Integer perform(IExpression left, IExpression right)
	{
		return (left.getValue() - right.getValue());
	}
}
/**
 * end of class
 */
