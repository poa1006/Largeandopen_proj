/*
 * This code is used for parse the data from 
 * http://data.gov.tw/opendata/Details?sno=345000000G-00014 and
 * http://data.gov.tw/opendata/Details?sno=355000000I-00005.
 * 
 * 
 * */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;


public class dataParser {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JSONException 
	 */
	
	
	public static void main(String[] args) throws IOException, JSONException {
		// TODO Auto-generated method stub
		String farmData = readFileToString("../farm.txt");		
		JSONArray farmArray = new JSONArray(farmData); 
		
	}

	public static String readFileToString(String filePath) throws IOException{
		StringBuilder fileData = new StringBuilder(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[10];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
		reader.close();
		return  fileData.toString();	
	}
	
	
}
