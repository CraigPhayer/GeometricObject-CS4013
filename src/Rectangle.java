import java.util.Objects;

public class Rectangle extends GeometricObject {
  private double width;
  private double height;

    /** Construct a rectangle with width and height */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  /**Return width*/
  public double getWidth() {
    return width;
  }

  /**Set a new width*/
  public void setWidth(double width) {
    this.width = width;
  }

  /**Return height*/
  public double getHeight() {
    return height;
  }

  /**Set a new height*/
  public void setHeight(double height) {
    this.height = height;
  }

  /**Implement the getArea method in GeometricObject*/
  @Override
  public double getArea() {
    return width*height;
  }

  /**Implement the getPerimeter method in GeometricObject*/
  @Override
  public double getPerimeter() {
    return 2*(width + height);
  }

  @Override
  public int compareTo(GeometricObject o) {
    if (getArea()>o.getArea()){
      return 0;
    } else if (getArea()<o.getArea()) {
      return 1;
    }else return -1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Rectangle rectangle)) return false;
    return Double.compare(rectangle.getWidth(), getWidth()) == 0 && Double.compare(rectangle.getHeight(), getHeight()) == 0;
  }

  @Override
  public String toString() {
    return "Rectangle [ " +
            "width: " + width +
            " height: " + height +
            " color: " + color +
            " weight: " + weight +
            " area: " + getArea() +
            " perimeter: " + getPerimeter() +
            " ]";
  }
}

