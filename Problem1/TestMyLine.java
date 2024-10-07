package Problem1;

//Creating the TestMyLine class.
public class TestMyLine {
    public static void main(String[] args){

        //Creating  x and y points.
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);

        //Creating the line.
        MyLine line = new MyLine(p1, p2);

        //Test for the toString method.
        System.out.println(line);

        //Test for the length of the line.
        System.out.println("Length of the line: " + line.getLength());
    }
}
