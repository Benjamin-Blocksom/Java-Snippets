class TrimDemo {
    public static void main (String [] args){
        String whitespace = "   whitespace at beginning and end     ";
	String escapechars = "\t   trim cuts out escaped tab and newline \n  ";
	System.out.println(whitespace.trim());
	System.out.println(escapechars.trim());
    }
}
