/**
 * This class is responsible to get the variables from the data and get the value
 * It implements IExpression
 */
package edu.wmich.cs1120.la5;
public class BinaryExpression implements IExpression
{
	private IOperation operation;
	private IExpression left;
	private IExpression right;
	
	/**
	 * BinaryExpression constructor
	 * Assigns the incoming variables to the declared objects
	 * @param operation is the sign of operation that needs to be executed
	 * @param left is the first value
	 * @param right is the second value
	 */
	public BinaryExpression(IOperation operation, IExpression left, IExpression right)
	{
		this.operation = operation;
		this.left = left;
		this.right = right;
	}
	
	/**
	 * This method send the first 2 values to IOperation perform method to get the value
	 * @return the value according to the operation executed
	 */
	public Integer getValue()
	{
		return operation.perform(left, right);
	}
}
/**
 * end of class
 */
