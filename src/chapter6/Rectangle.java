package chapter6;
//getter and setter
//constructor = same as name of class
//encapsulation = key principles of object-oriented programming.
//it specifies that the data(fields) of a class should be private and the methods
//(behaviour) of the class can be exposed (public) to other classes to use.
//To call methods, they need an access modifier

//Protected - other classes within a package can access

//blueprint for instances

public class Rectangle {

    private double length; //private = no other class can access this
    private double width;
//constructor for unknown parameters
    public Rectangle(){
        length = 0;
        width = 0;
    }
//constructor for known values of parameters
    public Rectangle(double length, double width){
        this.length = length;
        setWidth(width); //or setLength(length);setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){ //no parameters because constructor already gave it
        return length * width;
    }
}
