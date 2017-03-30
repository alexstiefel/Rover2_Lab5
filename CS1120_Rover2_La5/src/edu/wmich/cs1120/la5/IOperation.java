/**
 * Interface to perform operation by being called in the methods
 */
package edu.wmich.cs1120.la5;
public interface IOperation
{
	/**
	 * Performs any type of operation according to the sign from data
	 * @param left is the first value
	 * @param right is the second value
	 * @return the value that has been executed according to the operation
	 */
	public Integer perform (IExpression left, IExpression right);
}
/**
 * end of interface
 */
