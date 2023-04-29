public class Rectangle{
    private double length;
    private double width;

   public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }

public static void main(String[] args){
    Rectangle myinput = new Rectangle(2.0,3.0);
    
    System.out.println("the area of a rectangle is " + myinput. getArea());
     System.out.println("the perimeter of a rectangle is " + myinput.getPerimeter());

}
}