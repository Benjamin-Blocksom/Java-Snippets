class CharAtDemo {
	public static void main (String[]args){
		String string = "foo";
		System.out.println(string.charAt(0));
		System.out.println(string.charAt(2));
	
		try {
			System.out.println(string.charAt(3));
		} catch (Exception e) {
		System.out.println("fish out! " + e);
		}

	}
}
