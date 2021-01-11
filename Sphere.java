public class Sphere
{
  private double radius;
  
  public Sphere(double radius)
  {
    this.radius = radius;
  }

  public double getSA(double radius)
  {
    double SA = (4*(Math.PI))*(Math.pow(radius, 2));
    return SA;
  }
  public double getV(double radius)
  {
    double V = (4/3)*Math.PI*(radius*radius*radius);
    return V;
  }

}