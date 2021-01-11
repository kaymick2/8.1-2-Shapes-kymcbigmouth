import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int switchSelection = 0;
    double height = 0;
    double radius = 0;
    IceCreamCone nCone = new IceCreamCone(height, radius);
    Cylinder nCylinder = new Cylinder(height, radius);
    Sphere nSphere = new Sphere(radius);
    String shapeType = "shape value not entered";
    System.out.println("Please enter a number. 1 for Cone, 2 for Cylinder, and 3 for Sphere. Enter 4 to quit.");
        while (!in.hasNextInt()) {
            System.out.println("Please enter a number. 1 for Cone, 2 for Cylinder, and 3 for Sphere. Enter 4 to quit.");
            in.next();
        }
    do {
      switch (switchSelection) {
      case 1:
        System.out.println("You have selected Cone.");
        shapeType = "Cone";
        break;
      case 2:
        System.out.println("You have selected Cylinder.");
        shapeType = "Cylinder";
        break;
      case 3:
        System.out.println("You have selected Sphere.");
        shapeType = "Sphere";
        break;
      case 4:
        System.exit(69);

      default:
        System.out.println("Invalid response!");
        continue;
      }
    } while (switchSelection > 3);


    if (switchSelection == 1) {

      System.out.print("Enter the value of the radius:");
      radius = in.nextDouble();
      System.out.print("Enter the value of the height:");
      height = in.nextDouble();
      System.out.println("The surface area of the " + shapeType + " is " + nCone.getSA(height, radius));

      System.out.println("The volume of the cone is " + nCone.getV(height, radius));

    } else if (switchSelection == 2) {
      System.out.print("Enter the value of the radius:");
      radius = in.nextDouble();
      System.out.print("Enter the value of the height:");
      height = in.nextDouble();
      System.out.println("The surface area of the " + shapeType + " is " + nCylinder.getSA(height, radius));
      System.out.println("The volume of the cone is " + nCylinder.getV(height, radius));

    } else if (switchSelection == 3) {
      System.out.print("Enter the value of the radius:");
      radius = in.nextDouble();
      System.out.println("The volume of the " + shapeType + " is " + nSphere.getV(radius));

      System.out.println("The surface area of the " + shapeType + " is " + nSphere.getSA(radius));
    }
    in.close();
  }

}