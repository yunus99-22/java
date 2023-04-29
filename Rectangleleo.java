public class Rectangleleo {
    private double length;
    private double width;
    public Rectangleleo(double l, double w){
        length = l;
        width = w;

    }
    public void setlength(double l){
        this.length =length;
    }
    public double getLength(){
        return length;
    }
    public void setwidth(double width){
        this.width =width;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
}