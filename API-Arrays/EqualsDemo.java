import java.util.*;

class EqualsDemo {
	public static void main (String [] args){
	List<String> one = new ArrayList<>();
	List<String> two = new ArrayList<>();

	System.out.println(one.equals(two));
	one.add("one");
	System.out.println(one.equals(two));
	two.add("one");
	System.out.println(one.equals(two));
	}
}	
