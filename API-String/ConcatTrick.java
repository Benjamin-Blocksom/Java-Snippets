class ConcatTrick{
  public static void main (String [] args){
  	String s1 = "1";
	String s2 = s1.concat("2");
	s2.concat("3");
	System.out.print(s2);

  }
}
