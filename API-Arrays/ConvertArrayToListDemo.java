import java.util.*;

class ConvertArrayToListDemo {
	public static void main (String [] args) {
		String[] array = { "buy bread", "buy bananas"};
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		list.set(1, "test");
		array[0] = "new";
		for (String foo : array) 
			System.out.print(foo + " ");
		try {
		list.remove(1); 
		} catch (Exception e) {
		System.out.println("Changing list size throws: " 
			+ e);
		}
	}
}
