class MethodChainingTrick {
    public static void main (String[]args){ 
    String me = "me";
    String eye = me.toUpperCase();
    eye = eye.replace("e", "M").substring(0,1);
    System.out.println("me= " + me);
    System.out.println("eye= " + eye);
    
    }
}
