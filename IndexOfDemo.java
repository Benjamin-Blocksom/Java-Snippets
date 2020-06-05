class IndexOfDemo {
	public static void main (String[] args){
		String string = "Marco-Polo";
		System.out.println(string.indexOf('a'));
		System.out.println(string.indexOf('-'));
		System.out.println(string.indexOf("o-P"));
		System.out.println(string.indexOf("Marco"));

		if (string.indexOf("Marco", 1)<0) {System.out.println("Marco");}
		else {System.out.println("Polo");}
		}
}



