package edu.wmich.cs1120.la5;

public class ExpressionFactory
{
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
