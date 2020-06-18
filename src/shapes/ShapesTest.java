package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
        Measurable myShape = new Square(4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShape2 = new Rectangle(2, 5);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());



    }
}
