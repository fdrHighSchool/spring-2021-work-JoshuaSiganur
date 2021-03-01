package Point.java; //pointDriver.java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Point> point = new ArrayList<Point>();
      point.add(new Point());
      point.add(new Point(1.0, 2.0));
      point.add(new Point(3.0, 4.0));
      System.out.println(point);

      System.out.println("The midpoint for point 1 and point 2 is: " + point.get(0).midpoint(point.get(1)));
      System.out.println("The distance for point 1 and point 2 is: " + point.get(0).distance(point.get(2)));
      System.out.println("Are the 3 points collinear: " + point.get(0).isCollinear(point.get(1), point.get(2)));
  }
}
