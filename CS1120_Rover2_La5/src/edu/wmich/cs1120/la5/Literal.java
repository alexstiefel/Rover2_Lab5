package edu.wmich.cs1120.la5;

public class Literal implements IExpression
{
	private int value;
	
	public Literal(int value)
	{
		this.value = value;
	}
	
	public Integer getValue()
	{
		return this.value;
	}
}
