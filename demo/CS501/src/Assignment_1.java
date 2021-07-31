import java.util.Scanner;

public class Assignment_1 {
    //Problem 1.1
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Learning Java Now");
        System.out.println("Programming is fun" + '\n');

        //Problem 1.5
        System.out.println((7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5) + '\n');
        //Problem 2.15
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1, x2, y1, y2;

        x1 = input.nextDouble();
        y1 = input.nextDouble();

        System.out.println("Enter x2 and y2: ");

        x2 = input.nextDouble();
        y2 = input.nextDouble();

        double exs = Math.pow((x2 - x1), 2);
        double whys = Math.pow((y2 - y1), 2);
        double a = Math.pow((exs + whys), 0.5);
        System.out.println("The distance between the two points is " + a + '\n');
        Problem_219();

    }

    public static void Problem_219() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)), 0.5);
        double side2 = Math.pow((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2)), 0.5);
        double side3 = Math.pow((Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2)), 0.5);
        double s = (side1 + side2 + side3) / 2;

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        System.out.println("The area of the triangle is " + area);
    }
}
