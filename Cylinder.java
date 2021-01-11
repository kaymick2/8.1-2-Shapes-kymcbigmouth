public class Cylinder {
  private double height;
  private double radius;

  public Cylinder(double height, double radius) {
    this.height = height;
    this.radius = radius;
  }

  public double getSA(double height, double radius) {
    double SA = (2 * (Math.PI) * (radius) * (height)) + 2 * Math.PI * (Math.pow(radius, 2));
    return SA;
  }

  public double getV(double height, double radius) {
    double V = (Math.PI * (radius * radius) * height);
    return V;
  }
}