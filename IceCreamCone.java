public class IceCreamCone
{
  private double height;
  private double radius;
  
  public IceCreamCone(double height, double radius)
  {
    this.height = height;
    this.radius = radius;
  }

  public double getSA(double height, double radius)
  {
    double a = Math.sqrt(radius*radius + height*height);
    double SA = Math.PI*(radius*radius) + (Math.PI*radius*a);
    return SA;
  }
  public double getV(double height, double radius)
  {
    double V = (Math.PI*(radius*radius)*height)/3;
    return V;
  }

}