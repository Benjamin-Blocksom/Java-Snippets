import java.util.*;

class PandoraNull {
  public static void main (String [] args){
  List<Integer> evilIntegers = new ArrayList<>();
  evilIntegers.add(13);
  evilIntegers.add(666);
  evilIntegers.add(null);

  System.out.println(evilIntegers.size());

  try {
  	System.out.println("There are " + 
		  evilIntegers.size() + 
		  " evils in this box.");
  	System.out.println("The first is " +
		  evilIntegers.get(0) +  ".");
  	System.out.println("The next is " + 
		  evilIntegers.get(1) + ".");
  	System.out.println("The final evil is " +
		  evilIntegers.get(2) + ".");
  
  	System.out.println("Heaven");
  	} catch (Exception e) {
  	System.out.println("The final evil: " + e);
  	} finally {
  	System.out.println("Also named hope.");
  	}	
  }
}
