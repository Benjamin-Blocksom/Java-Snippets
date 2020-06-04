import java.util.*;

class ConvertArrayToList {
    public static void main (String [] args) {
	List<String> list = new ArrayList<>();
	list.add("corn flakes");
	list.add("fruity pebbles");
	Object[] objectArray = list.toArray();
	System.out.println(objectArray.length);
	String[] stringArray = list.toArray(new String[0]);
	System.out.println(stringArray.length);
    }
}
