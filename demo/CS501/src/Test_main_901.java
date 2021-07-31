import java.util.Scanner;

public class Test_main_901 {
    public static void main(String[] args) {
        while (true) {
            ShowRect();
        }
    }

    public static void ShowRect() {
        System.out.println("Enter width and length to build a rectangle");
        Scanner scanner = new Scanner(System.in);
        double width, height;
        width = scanner.nextDouble();
        height = scanner.nextDouble();
        Rectangle rectangle1 = new Rectangle();
        try {
            rectangle1.setWidth(width);
            rectangle1.setHeight(height);
            System.out.println("\n Rectangle ");
            System.out.println("Width:    " + rectangle1.getWidth());
            System.out.println("Height:   " + rectangle1.getHeight());
            System.out.println("Area:     " + rectangle1.getArea());
            System.out.println("Perimeter: " + rectangle1.getPerimeter());

        } catch (Exception e) {
            System.out.println("Please try again");
        }

    }
}
