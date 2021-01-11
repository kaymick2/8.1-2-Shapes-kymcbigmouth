import java.util.Scanner;

public class Main
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the value of the radius:");
    double radius = in.nextDouble();
    System.out.print("Enter the value of the height:");
    double height = in.nextDouble();
    IceCreamCone cone = new IceCreamCone(height, radius);
    System.out.println("The surface area of the cone is "+cone.getSA());
    System.out.println("The volume of the cone is "+cone.getV());
  }
}