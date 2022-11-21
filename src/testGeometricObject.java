public class testGeometricObject {
    public static void main(String[] args) {
        Circle c1 = new Circle(25000,"blue",5);
        Rectangle r1 = new Rectangle(4,8);
        r1.setColor("red");
        r1.setWeight(4);
        GeometricObject g = GeometricObject.max(c1,r1);
        System.out.println("The area of the larger object is:\n" + g);

        GeometricObject[] shapes = new GeometricObject[5];
        shapes[0] = new Square();
        shapes[1] = new Square(6,7,"red");
        shapes[2] = new Rectangle(5,6);
        shapes[3] = new Circle(7.5,"blue",4);
        shapes[4] = new Square(5);

        for (int i = 0; i < shapes.length-1; i++) {
            if (shapes[i] instanceof Colorable){
                ((Colorable) shapes[i]).howToColor();
            }
        }

    }
}
