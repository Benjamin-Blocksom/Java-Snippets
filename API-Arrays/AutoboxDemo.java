import java.util.*;
import java.lang.Float;

class AutoboxingDemo {
	public static void main (String [] args) {
	List<Float> numbers = new ArrayList<>();
	numbers.add(14.7f);

	numbers.add(new Float(42.0f));
	System.out.println(numbers);

	numbers.remove(14);
	float leftovers = numbers.get(0);

	System.out.println(leftovers);

	
	}

}
