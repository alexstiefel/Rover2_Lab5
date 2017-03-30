package edu.wmich.cs1120.la5;
import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.*;
import java.util.*;
public class MapCreatorFromDat implements IMapCreator
{
	private TerrainScanner scanner;
	private IExpression expression;
	private IArea[][] terrainArea = new IArea[10][10];
	
	public MapCreatorFromDat()
	{
		this.scanner = new TerrainScanner();
	}
	
	public void setScanner(TerrainScanner scanner)
	{
		this.scanner = scanner;
	}
	
	public void scanTerrain (String fileName, int threshold) throws IOException
	{
		RandomAccessFile file = new RandomAccessFile(new File(fileName), "r");
		int value = 0;
		boolean input = false;
		int i = 0;
		int j = 0;
		
		while (input == false)
		{
			file.seek(value * 34);
			
			double basicEnergyCost = file.readDouble();
			double elevation = file.readDouble();
			double radiation = file.readDouble();
			
			if (radiation >= 0.5)
			{
				terrainArea[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
			} 
			else if (radiation < 0.5 && elevation > (threshold * 0.5))
			{
				terrainArea[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
			} 
			else 
			{

				terrainArea[i][j] = new LowArea(basicEnergyCost, elevation, radiation);
			}
			
			if (j < 9)
			{
				j++;
			}
			else if (j == 9)
			{
				j = 0;
				i++;
			}
			
			char operand = file.readChar();
			int val1 = file.readInt();
			int val2 = file.readInt();
			expression = ExpressionFactory.getExpression(operand, val1, val2);
			value = expression.getValue();
			
			if (value == -1)
			{
				input = true;
			}
		}
		
		scanner.setTerrain(terrainArea);
		file.close();
	}
		
	public TerrainScanner getScanner()
	{
		return this.scanner;
	}
}
