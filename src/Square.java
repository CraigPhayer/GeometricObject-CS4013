public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square() {
        this(1, 1, "white");
    }

    public Square(double side, double weight, String color) {
        super(color, weight);
        this.side = side;

    }

    public Square(double side){
        super("white",1);
        this.side = side;
    }


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea()) {
            return 0;
        } else if (getArea() < o.getArea()) {
            return 1;
        } else return -1;
    }

    @Override
    public void howToColor() {
        System.out.println("Colour all four sides");
    }

    public String toString() {
        return "Square [ " +
                "sides: " + side +
                " color: " + color +
                " weight: " + weight +
                " area: " + getArea() +
                " perimeter: " + getPerimeter() +
                " ]";
    }
}


