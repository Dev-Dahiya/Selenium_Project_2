package ReadingFiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException{
		Properties prop = new Properties();
		String filePath = "/Users/devkumar/Documents/new_workspace_java/JavaTutorial/src/ReadingFiles/test.properties";
		
		/* This code will create a buffered stream of the file
		 * or we can say, will load the file in memory
		 */
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
	

		/* This method reads property list (key and element pairs) from 
		 * the input character stream in a simple line-oriented format.
		 */
		prop.load(reader);
		
		prop.setProperty("fee", "2000");
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));
		System.out.println(prop.getProperty("fe"));
		}
	
	}
