class MutabilityDemo {
    public static void main (String[] args){
    	   class Mutable {
            private String s;
            public void setS(String newS) { s = newS; }
            public String getS() { return s; }
    }

    final class Immutable {
    private String s = "name";
    public String getS() { return s;}
    }
    
	Mutable myMutable = new Mutable();
   	Immutable myImmutable = new Immutable();

    myMutable.setS("foo");
    System.out.println(myMutable.getS());
    System.out.println(myImmutable.getS());
    }
}
