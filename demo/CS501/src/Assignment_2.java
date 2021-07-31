import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        //Problem 3.3
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        if (a * d != b * c) {
            System.out.println("x : " + (e * d - b * f) / (a * d - b * c)
                    + "  y : " + (a * f - e * c) / (a * d - b * c));
        } else {
            System.out.println("The equation has no solution");
        }


        //Problem 3.27
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if ((x >= 0) && (y >= 0) && (x <= 200) && (y <= 100) && (y <= 100 - x / 2)) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }


        //Problem 4.2
        final double RADIUS_OF_THE_EARTH = 6371.01;
        System.out.print("Enter  latitude and longitude 1 in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter  latitude and longitude  2 in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double greatCircleDistance = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                        Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                                Math.cos(Math.toRadians(y1 - y2)));
        System.out.println("The distance between the two points is " + greatCircleDistance + " km");

        System.out.println();


        // Problem 4.3
        double s;
        double chaX = 35.2270869;
        double chaY = -80.8431267;
        double atlX = 33.7489954;
        double atlY = -84.3879824;
        double savX = 32.0835407;
        double savY = -81.0998342;
        double orlX = 28.5383355;
        double orlY = -81.3792365;

        double distanceChaAtl = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(chaX)) * Math.sin(Math.toRadians(atlX)) +
                        Math.cos(Math.toRadians(chaX)) * Math.cos(Math.toRadians(atlX)) *
                                Math.cos(Math.toRadians(chaY - atlY)));
        double distanceAtlOrl = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(atlX)) * Math.sin(Math.toRadians(orlX)) +
                        Math.cos(Math.toRadians(atlX)) * Math.cos(Math.toRadians(orlX)) *
                                Math.cos(Math.toRadians(atlY - orlY)));
        double distanceOrlSav = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(orlX)) * Math.sin(Math.toRadians(savX)) +
                        Math.cos(Math.toRadians(orlX)) * Math.cos(Math.toRadians(savX)) *
                                Math.cos(Math.toRadians(orlY - savY)));
        double distanceSavCha = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(savX)) * Math.sin(Math.toRadians(chaX)) +
                        Math.cos(Math.toRadians(savX)) * Math.cos(Math.toRadians(chaX)) *
                                Math.cos(Math.toRadians(savY - chaY)));
        double distanceChaOrl = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(chaX)) * Math.sin(Math.toRadians(orlX)) +
                        Math.cos(Math.toRadians(chaX)) * Math.cos(Math.toRadians(orlX)) *
                                Math.cos(Math.toRadians(chaY - orlY)));

        s = (distanceChaAtl + distanceAtlOrl + distanceChaOrl) / 2;
        double areaChaAtlOrl = Math.pow(s * (s - distanceChaAtl) * (s - distanceAtlOrl) * (s - distanceChaOrl), 0.5);
        s = (distanceOrlSav + distanceSavCha + distanceChaOrl) / 2;
        double areaChaOrlSav = Math.pow(s * (s - distanceOrlSav) * (s - distanceSavCha) * (s - distanceChaOrl), 0.5);

        double areaChaAtlOrlSav = areaChaAtlOrl + areaChaOrlSav;
        System.out.println("The estimated area enclosed by these four cities is " + areaChaAtlOrlSav);
    }


}

