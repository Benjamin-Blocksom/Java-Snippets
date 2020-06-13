// Remember: when both operands of a mathematival operator are integral types, the result is always the integer value that remains after truncating the fractional value.

class IntegralTypeDemo {
	public static void main (String[]args){
	byte start = 3;
	short first = 5;
	int second = 7;
	int myFunction = (int)(start/2 + first/2 + (int) first/3) + second/7;
	System.out.println(myFunction);
}
} 
