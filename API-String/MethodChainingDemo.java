class MethodChainingDemo {
    public static void main (String[]args){

	String quote = "  \t  lOOk Before, OR you'll find yourself BEHIND.   ";
	System.out.println(quote.trim().toLowerCase().replace('b', 'B').substring(1, 12));
    }
}
