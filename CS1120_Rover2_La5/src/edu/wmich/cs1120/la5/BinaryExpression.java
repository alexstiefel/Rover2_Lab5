package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression
{
	private IOperation operation;
	private IExpression left;
	private IExpression right;
	
	public BinaryExpression(IOperation operation, IExpression left, IExpression right)
	{
		this.operation = operation;
		this.left = left;
		this.right = right;
	}
	
	public Integer getValue()
	{
		return operation.perform(left, right);
	}
}
