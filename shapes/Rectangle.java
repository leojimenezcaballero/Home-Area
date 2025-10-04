package shapes; 

public class Rectangle {
    //atributos
    private double length;
    private double width;

    //constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //metodos
    //getter and setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //metodo para calcular el area del rectangulo
    public double Area() {

       // double area = length * width;
       // return area;

       return length * width;
    }


    
}
