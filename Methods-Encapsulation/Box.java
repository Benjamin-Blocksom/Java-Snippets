// A Demonstration of uncommon constructors

class Box {
    private String color;
    private int height;
    private int length;

    public Box (int length, int myHeight){
    length = this.length; // Careful! This assigns 0 to length and is no good.
    this.height = myHeight;
    this.color = "beige";
    }

    public static void main (String[]args){
    	Box a = new Box(2, 3);
	System.out.println(a.length + " " + a.height + " " + a.color);
	}
    }

