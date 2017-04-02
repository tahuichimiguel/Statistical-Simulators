/** Simple Program to write a text file
 */

import java.io.*;

public class Writer{
	
	public Writer(){}
	
	public void writeVector(double[] input, String file){
		try {
			FileWriter outFile = new FileWriter(file);
			PrintWriter out = new PrintWriter(outFile);
			
			for(int i = 0; i<input.length; i++){
				out.println(input[i]);
			}
			
			out.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}