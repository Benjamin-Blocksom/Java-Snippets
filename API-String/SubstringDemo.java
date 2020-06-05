class SubstringDemo {
    public static void main (String[]args){
    String string1 = "012345";
    String string2 = "abcDEF";
    
    System.out.println(string1.substring(3));
    System.out.println(" " + string2.substring(3));

    System.out.println(string1
		    .substring(string1
			    .indexOf('3')));
    System.out.println(string2
		    .substring(string2
			    .indexOf('D')));

    System.out.println(string2.substring(3, 4));
    System.out.println(string2.substring(3,6));

    }
}
