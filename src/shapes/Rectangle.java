package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
   public Rectangle(double length, double width){
       super(length, width);
   }

   @Override
   public void setLength(){
       this.length = length;
   }
   @Override
   public void setWidth(){
       this.width = width;

   }

    @Override
    public double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//    public double getArea(){
//        return length * width;
//    }
//    public double getPerimeter(){
//        return 2 * length + 2 * width;
//    }
}
