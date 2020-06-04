// Know:
//
// 1. If both operands are numeric,
// then the `+` means numeric addition.
// 2. If either operand is a `String`,
// it means concatenation.
// 3. Expressions are evaluated left tp right

class ConcatenationDemo {
  public static void main (String [] args){
	System.out.println(1 + 2);
        System.out.println("a" + "b");
	System.out.println("a" + "b" + 3);
	System.out.println(1 + 2 + "c");	
  }
}
