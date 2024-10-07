package Problem2;

//Creating MyRectangle class.
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    //Creating the constructor.
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    //Creating topLeft getter function.
    public MyPoint getTopLeft(){
        return topLeft;
    }

    //Creating topLeft setter function.
    public void setTopLeft(MyPoint topLeft){
        this.topLeft  = topLeft;
    }
    
    //Creating bottomRight getter function.
    public MyPoint getBottomRight(){
        return bottomRight;
    }

    //Creating bottomRight setter function.
    public void setBottomRight(MyPoint bottomRight){
        this.bottomRight = bottomRight;
    }

    //Calculations for the width of the rectangle.
    public int getWidth(){
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    //Calculations for the height of the rectangle.
    public int getHeight(){
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    //Calculations for the perimeter of the rectangle.
    public int getPerimeter(){
        return 2 * (getWidth() + getHeight());
    }

    //Calculations for the area of the rectangle.
    public int getArea(){
        return getWidth() * getHeight();
    }

    //Creating the toString method.
    public String toString(){
        return "Rectangle[topLeft = " + topLeft + ", bottomRight = " + bottomRight + ", width = " + getWidth() + ", height = " + getHeight() + "]";
    }

}
