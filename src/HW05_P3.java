import java.util.Scanner;

public class HW05_P3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in);

//get input values for the constructors
        System.out.println("Enter side 1: ");
        double side1 = scan.nextDouble();
        System.out.println("Enter side 2: ");
        double side2 = scan.nextDouble();
        System.out.println("Enter side 3: ");
        double side3 = scan.nextDouble();
//create triangle
        Triangle tri = new Triangle(side1,side2,side3);

        System.out.println("Enter Color: ");
        String color = scan.next();
        tri.setColor(color);

        System.out.println("Enter true if the triangle is filled and false if not: ");
        Boolean filled = scan.nextBoolean();
        tri.setFilled(filled);

        System.out.println(tri.toString());
        System.out.println(tri.getColor());
        System.out.println(tri.isFilled());
        System.out.println(tri.getArea());
        System.out.println(tri.getPerimeter());










    }
}
