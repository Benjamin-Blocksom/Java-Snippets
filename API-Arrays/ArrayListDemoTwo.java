import java.util.*;

class ArrayListDemoTwo {
	public static void main (String [] args) {
    ArrayList foo = new ArrayList ();
    ArrayList bar = new ArrayList (4);
    ArrayList baz = new ArrayList (bar);
    ArrayList<String> qux = new ArrayList<String>();
    ArrayList<String> quux = new ArrayList<>();
    List<String> quuz = new ArrayList<>();
    System.out.print(
		    foo + " " + 
		    bar + " " + 
		    baz + " " + 
		    qux + " " +
		    quux + " " + 
		    quuz + " ");
  }
}
