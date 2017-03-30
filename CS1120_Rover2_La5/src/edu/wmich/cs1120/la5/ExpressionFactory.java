/**
 * This class is responsible from sending the variables from the data to respective classes
 */
package edu.wmich.cs1120.la5;
public class ExpressionFactory
{
	/**
	 * 
	 * @param operator is the sign of operation that needs to be executed
	 * @param val1 is the first value from the data
	 * @param val2 is the second value from the data
	 * @return the value that is used to seek in the data
	 */
	public static IExpression getExpression(char operator, int val1, int val2)
	{
		Addition add = new Addition();
		Subtraction subtract = new Subtraction();
		Literal value1 = new Literal(val1);
		Literal value2 = new Literal(val2);
		
		if(operator == '+')
		{
			IExpression addValue = new BinaryExpression(add, value1, value2);
			return addValue;
		}
		else if(operator == '-')
		{
			IExpression subtractValue = new BinaryExpression(subtract, value1, value2);
			return subtractValue;
		}
		return null;
	}
}
/**
 * end of class
 */
