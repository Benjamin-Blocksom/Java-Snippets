// Make an array of length two with a banana in each slot
import java.util.*;

class TwoItems {
  public static void main (String [] args){
  ArrayList<String> twoItems = new ArrayList<>();
  
  twoItems.add("banana");
  twoItems.add("banana");

  System.out.println("There are this many items: " 
		  + twoItems.size());
  
  System.out.println(twoItems.contains("banana"));
  System.out.println(twoItems.contains("orange"));
  }
}
