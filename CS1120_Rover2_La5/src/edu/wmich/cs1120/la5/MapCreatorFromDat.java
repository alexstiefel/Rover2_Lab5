/**
 * This class is responsible to create the map
 * It implements IMapCreator interface
 */
package edu.wmich.cs1120.la5;
import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.*;
import java.util.*;
public class MapCreatorFromDat implements IMapCreator
{
	private TerrainScanner scanner;
	private IExpression expression;
	private IArea[][] terrainArea = new IArea[10][10];
	
	/**
	 * MapCreatorFromDat class constructor
	 * Creates a TerrainScanner object
	 */
	public MapCreatorFromDat()
	{
		this.scanner = new TerrainScanner();
	}
	
	/**
	 * Sets the incoming object of TerrainScanner to the existing object
	 * @param is the object of the class TerrainScanner
	 */
	public void setScanner(TerrainScanner scanner)
	{
		this.scanner = scanner;
	}
	
	/**
	 * Scans the dat file
	 * Takes each variable in the file and assigns them accordingly
	 * Assigns double values to the array
	 * Assigns char value to the char variable to execute the value
	 * Assigns the following int values to be executed
	 * @param fileName is the dat file
	 * @param thresold is the value set by the user
	 * @throws IOException shows if an IOException has occurred
	 */
	public void scanTerrain (String fileName, int threshold) throws IOException
	{
		RandomAccessFile file = new RandomAccessFile(new File(fileName), "r");
		int value = 0;
		boolean input = false;
		int i = 0;		
		while (input == false)
		{
			for(int j = 0; j < 10; j++)
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
			i++;
		}
		scanner.setTerrain(terrainArea);
		file.close();
	}
	
	/**
	 * Returns the TerrainScanner object
	 */
	public TerrainScanner getScanner()
	{
		return this.scanner;
	}
}
/**
 * end of class
 */
