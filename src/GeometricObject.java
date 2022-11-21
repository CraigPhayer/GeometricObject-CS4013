public abstract class GeometricObject implements Comparable<GeometricObject>{
  protected String color;
  protected double weight;

  // Default construct
  protected GeometricObject() {
    color = "white";
    weight = 1.0;
  }

  // Construct a geometric object
  protected GeometricObject(String color, double weight) {
    this.color = color;
    this.weight = weight;
  }

  public static GeometricObject max(GeometricObject g1,GeometricObject g2){
     if (g1.compareTo(g2) == 0){
       return g1;
     } else if (g1.compareTo(g2) > 0) {
       return g2;
     }else return g1;
  }

  // Getter method for color
  public String getColor() {
    return color;
  }

  // Setter method for color
  public void setColor(String color) {
    this.color = color;
  }

  // Getter method for weight
  public double getWeight() {
    return weight;
  }

  // Setter method for weight
  public void setWeight(double weight) {
    this.weight = weight;
  }

  // Abstract method
  public abstract double getArea();

  // Abstract method
  public abstract double getPerimeter();
  
 
}
