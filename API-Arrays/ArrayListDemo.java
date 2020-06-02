// ArrayList must be imported
import java.util.ArrayList;

class ArrayListDemo {
// The original ArrayList constructors from pre-Java 5: 

// ArrayList with default slots for elements, 
// but no slots filled
ArrayList arrayListOne = new ArrayList();

// ArrayList with 7 slots, but none filled
ArrayList arrayListTwo = new ArrayList(7);

// copy ArrayList2 
ArrayList arrayListThree = new ArrayList(arrayListTwo);

// Generics, the new and improved way. It lets you specify
// the type of class ArrayList will contain:

ArrayList<String> arrayListFour = new ArrayList<String>();

// You can even omit the type from the right side:

ArrayList<String> arrayListFive = new ArrayList<>();

// One last thing: ArrayList implements the `List` interface,
// so you can store ArrayList in a List reference variable.

List<String> arrayListSix = new ArrayList<>();

// Watch out! The opposite is not true. List cannot store 
// ArrayList in a reference variable. (Interfaces cannot be 
// instantiated.)

  public static void main (String [] args) {
    System.out.println(arrayListOne);
  }

 }
