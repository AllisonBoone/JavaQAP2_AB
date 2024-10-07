package Problem2;

//DUPLICATE FILE FROM PROBLEM1!

//Creating the MyPoint class.
public class MyPoint {
    private int x;
    private int y;

    //Creating the constructor.
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Creating the x getter function.
    public int getX(){
        return x;
    }

    //Creating the x setter function.
    public void setX(int x){
        this.x = x;
    }

    //Creating the y getter function.
    public int getY(){
        return  y;
    }

    //Creating the y setter function.
    public void setY(int y){
        this.y = y;
    }

    //Creating the toString method.
    public String toString(){
        return "(" + x + "," + y + ")";
     }

     //Calculations to find the distance to another point.
     public double distance(MyPoint another){
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
     }
}
