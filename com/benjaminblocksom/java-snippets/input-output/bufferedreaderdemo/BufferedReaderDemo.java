package bufferedreaderdemo;

import java.io.*;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class BufferedReaderDemo {
	private String choice;
	
	public BufferedReaderDemo (String choice){
	this.choice = choice;
	}
	
	public void readPoem (String choice) throws IOException {
	File myFile = new File(choice);
	
	try {
		BufferedReader reader = new BufferedReader(new FileReader(myFile));
		String line;
		while((line = reader.readLine())!=null){
			System.out.println(line);
			}
		} catch (IOException e) {
		
			}
	}
}
