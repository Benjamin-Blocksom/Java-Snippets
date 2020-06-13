// public String intern() returns
// a canoncial representation for the 
// string object.

class InternDemo {
  public static void main (String[]args){
	String s = "";
	String t = "t";
	System.out.println(s.intern() == t.intern());
	}

}
