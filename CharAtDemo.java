class CharAtDemo {
	public static void main (String[]args){
	String string = "Marco-Polo";
	
	System.out.println(string);
	System.out.println(string.length());

	for (int i = 0; i < string.length(); i++) {
		System.out.print(string.charAt(i) + " ");
		}
	}
}

