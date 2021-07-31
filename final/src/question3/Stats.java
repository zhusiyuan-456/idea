package question3;
import java.util.*;
import java.io.*;
public class Stats {

    public static void main(String[] args) throws IOException{

        Stats s = new Stats("points.dat"); // read in the points file into the stats object
        System.out.println(s): // print the stats as shown above
        s.addRandomWalk(); // add uniformly distributed random numbers to every x and y
        // print out the statistics again
        try {
            try{
                int[] x= new int[0];
                int[] y=new int[0];


                Scanner scanLine = new Scanner(s);

                String line= scanLine.nextLine();

                Scanner scanNumber = new Scanner(line);
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }


    }



}
