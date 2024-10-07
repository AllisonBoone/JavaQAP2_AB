package Problem1;

//Creating MyLine class.
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    //Creating the constructor.
    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }

    //Creating begin getter function.
    public MyPoint getBegin(){
        return begin;
    }

    //Creating begin setter function.
    public void setBegin(MyPoint begin){
        this.begin = begin;
    }
    
    //Creating end getter function.
    public MyPoint getEnd(){
        return end;
    }

    //Creating end setter function.
    public void setEnd(MyPoint end){
        this.end = end;
    }

    //Creating the toString method.
    public String toString(){
        return "Line[begin = " + begin + ", end = " + end + "]";
    }

    //Calculations to find the length of the line.
    public double getLength(){
        return begin.distance(end);
    }
    
    }

