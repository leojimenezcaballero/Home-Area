package shapes;
public class Square {

    //atributos
    private double side;

    //constructor
    public Square(double side) {
        this.side = side;
    }

    //metodos
    //getter and setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //metodo para calcular el area del cuadrado
    public double Area() {

       // double area = side * side;
       // return area;

       return Math.pow(side, 2);
    }
    
}
