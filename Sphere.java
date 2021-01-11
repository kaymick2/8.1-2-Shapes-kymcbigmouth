public class Sphere
{
  private double radius;
  
  public Sphere(double radius)
  {
    this.radius = radius;
  }

  public double getSA()
  {
    double SA = (4*(Math.PI))*(Math.pow(radius, 2));
    return SA;
  }
  public double getV()
  {
    double V = (4/3)*(Math.PI)*(Math.pow(radius, 3));
    return V;
  }

}