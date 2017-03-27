/**
 * Interface for the MapCreator class
 */
package edu.wmich.cs1120.la5;
import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.IOException;;
public interface IMapCreator
{
	
	/**
	 * Scans the text file
	 * Takes each line of the file and divides them into 3 variables
	 * Assigns those variables to the array
	 * @param fileName is the text file
	 * @param thresold is the value set by the user
	 * @throws IOException shows if an IOException has occured
	 */
	public void scanTerrain (String fileName, int threshold) throws IOException;
	
	/**
	 * Returns the TerrainScanner object
	 */
	public TerrainScanner getScanner();
	
	/**
	 * Sets the incoming object of TerrainScanner to the existing object
	 * @param is the object of the class TerrainScanner
	 */
	public void setScanner(TerrainScanner scanner);
}
/**
 * end of interface
 */
