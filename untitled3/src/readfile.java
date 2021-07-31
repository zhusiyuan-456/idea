import java.util.*;
import java.io.*;

public class readfile{
    public static void main(String[] args)throws IOException{
        Scanner s = new Scanner(new File("2020S/Session07/solarsystem.dat"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()){
            list.add(s.next());
            int x;
        }
        s.close();
    }
}