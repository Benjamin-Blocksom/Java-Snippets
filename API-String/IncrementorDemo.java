// `a += "1"` is the same as `a = a + "1"`

class IncrementorDemo {
  public static void main (String [] args){
  String a = "1";
  a += "2";
  a += 3;
  System.out.println(a);
  }
}
