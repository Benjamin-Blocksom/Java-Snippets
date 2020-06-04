import java.util.*;

class SortingDemo {
  public static void main (String [] args) {
  List<Boolean> sillySort = new ArrayList<>();
  sillySort.add(true);
  sillySort.add(false);
  sillySort.add(true);
  sillySort.add(false);
  sillySort.add(true);
  Collections.sort(sillySort);
  System.out.println(sillySort);
  }
}
