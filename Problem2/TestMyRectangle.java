package Problem2;

//Creating the TestMyRectangle class.
public class TestMyRectangle {
    public static void main(String[] args){
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(4, 1);

        //Creating the rectangle.
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        //Test for the toString method.
        System.out.println(rectangle);

        //Test for the perimeter of the rectangle.
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        //Test for the area of the rectangle.
        System.out.println("Area: " + rectangle.getArea());
    };

}
