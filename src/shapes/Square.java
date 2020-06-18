package shapes;

public class Square extends Quadrilateral {
    public Square(double s){
        super(s,s);
    }

    @Override
    public void setLength() {
        this.length = length;
    }

    @Override
    public void setWidth() {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    //    public Square(double side) {
//        super(side, side);
//    }

//    @Override
//    public double getPerimeter(){
//        return 4 * width;
//    }
//
//    @Override
//    public double getArea(){
//        return Math.pow(width, 2);
//    }

}
