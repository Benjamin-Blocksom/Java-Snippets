import java.util.*;

class EightPieces {

  public static void main (String[] args){
    ArrayList<String> eightPieces = new ArrayList<>(8);
   	eightPieces.add("horse-stance");
	eightPieces.add(0, "breathe");
	eightPieces.add(0, "raise-hands");
	eightPieces.add(1, "lift-arms");
	eightPieces.add(1, "punch");
	eightPieces.add(5, "horse-stretch");
	eightPieces.add(0, "toe-stretch");
	eightPieces.add(7, "drop-weight");
   	
	System.out.println(eightPieces);
	System.out.println("removing one piece?");
	System.out.println(eightPieces.remove("theHundred"));
	System.out.println("How about now? Removing a piece?");
	System.out.println(eightPieces.remove("toe-stretch"));
	System.out.println(eightPieces.size());

	try {
		eightPieces.remove(100);
	} catch (Exception e){
	System.out.println("Fish out of water!");
	System.out.println("(That means there was a Run time exception: " 
			+ e + ".)");
	}

	eightPieces.set(0, "twist");
	System.out.println("What did you swap the first item for?"
		       	+ eightPieces);

	try {
	  eightPieces.set(8, "rattle");
	} catch (Exception e) {
	  System.out.println("Fish out of water!");
	}

	System.out.println("Does eightPieces have anything in it?" 
			+ (!eightPieces.isEmpty()));

	System.out.println("How many pieces in eightPieces? " 
			+ (eightPieces.size()));
	
	eightPieces.clear();
	System.out.println("Now that I've cleared eight pieces,"
			+ "does eightPieces have anything in it?"
			+ (!eightPieces.isEmpty()));

	System.out.println("How many pieces in eightPieces? "
		       + (eightPieces.size()));
		
  }
}
