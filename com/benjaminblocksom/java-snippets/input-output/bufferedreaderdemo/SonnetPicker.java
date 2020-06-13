package bufferedreaderdemo;

import java.util.*;

public class SonnetPicker {
	public static void main (String[]args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter in the file name: ");
	String choice = scanner.next();
	BufferedReaderDemo bufferedReaderDemo = new BufferedReaderDemo(choice);
	}
}
