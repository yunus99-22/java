public class Rectangle1{

    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;

    }

    public double getArea(){
        return length*width;

    }
    public double getPerimeter(){
        return 2 *(length + width);

    }
        public static void main(String[]args){
            Rectangle rect = new Rectangle(2.0,3.0);
            System.out.println("Area of rectangle is" + rect.getArea());
            System.out.println("Perimeter of rectangle is" + rect.getPerimeter());


        }
    
}