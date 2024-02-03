public class Circle extends GeometricObject implements Comparable<Circle> {

  // Same as lines 2−47 in Listing 11.2, so omitted

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Circle circle = (Circle) o;
    return Double.compare(circle.getRadius(), getRadius()) == 0;
  }

@Override
public int compareTo(Circle o) {
    return Double.compare(getRadius(), o.getRadius());
} 
