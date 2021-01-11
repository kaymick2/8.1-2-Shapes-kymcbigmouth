import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int switchSelection = 0;
    double height = 0;
    double radius = 0;
    String shapeType = "shape value not entered";
    System.out.println("Please enter a number. 1 for Cone, 2 for Cylinder, and 3 for Sphere. Enter 4 to quit.");
    try {
      switchSelection = in.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Please enter whole numbers only!");
      in.next();
    }
    do {
      switch (switchSelection) {
      case 1:
        System.out.println("You have selected Cone.");
        IceCreamCone nCone = new IceCreamCone(height, radius);
        shapeType = "Cone";
      case 2:
        System.out.println("You have selected Cylinder.");
        Cylinder nCylinder = new Cylinder(height, radius);
        shapeType = "Cylinder";
      case 3:
        System.out.println("You have selected Sphere.");
        Sphere nSphere = new Sphere(radius);
        shapeType = "Sphere";
      case 4:
        System.exit(69);

      default:
        System.out.println("Invalid response!");
        continue;
      }
    } while (switchSelection >= 3);
    if (switchSelection == 1) {

      System.out.print("Enter the value of the radius:");
      radius = in.nextDouble();
      System.out.print("Enter the value of the height:");
      height = in.nextDouble();
      System.out.println("The surface area of the " + shapeType + " is " + nCone.getSA());
      System.out.println("The volume of the cone is " + nCone.getV());

    } else if (switchSelection == 2) {
      System.out.print("Enter the value of the radius:");
      radius = in.nextDouble();
      System.out.print("Enter the value of the height:");
      height = in.nextDouble();
      System.out.println("The surface area of the " + shapeType + " is " + nCylinder.getSA());
      System.out.println("The volume of the cone is " + nCylinder.getV());

    } else if (switchSelection == 3) {
      System.out.print("Enter the value of the radius:");
      radius = in.nextDouble();
      System.out.println("The surface area of the " + shapeType + " is " + nSphere.getSA());
      System.out.println("The volume of the " + shapeType + " is " + nSphere.getV());
    }
    in.close();
  }

}