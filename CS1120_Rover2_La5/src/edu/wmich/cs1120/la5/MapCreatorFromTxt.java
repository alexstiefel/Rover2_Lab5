/**
 * This class is responsible to create the map
 * It implements IMapCreator interface
 */
package edu.wmich.cs1120.la5;
import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.*;
import java.util.*;
public class MapCreatorFromTxt implements IMapCreator
{
	private TerrainScanner scanner;
	private Area[][] terrain = new Area[10][10];
	
	/**
	 * MapCreator class constructor
	 * Creates a TerrainScanner object
	 */
	public MapCreatorFromTxt()
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
	 * Scans the text file
	 * Takes each line of the file and divides them into 3 variables
	 * Assigns those variables to the array
	 * @param fileName is the text file
	 * @param thresold is the value set by the user
	 * @throws IOException shows if an IOException has occured
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException
	{
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		String data;
	
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				data = inputFile.nextLine();
				String[] value = data.split(" ");			
				
				double basicEnergyCost = Double.parseDouble(value[0]);
				double elevation = Double.parseDouble(value[1]);
				double radiation = Double.parseDouble(value[2]);
				
				if (radiation > 0.5)
				{
					terrain[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
				}
				else if (radiation < 0.5 && elevation > (threshold * 0.5))
				{
					terrain[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
				}
				else 
				{
					terrain[i][j] = new LowArea(basicEnergyCost, elevation, radiation);
				}
			}
		}
		inputFile.close();
		
		getScanner().setTerrain(terrain);
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
