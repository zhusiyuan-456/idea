import java.io.*;
import java.util.*;


class Test
{
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileReader("score.txt"));

        HashMap<String, String> map = new HashMap<String, String>();

        while (scanner.hasNextLine()) {
            String[] columns = scanner.nextLine().split("\t\t");
            map.put(columns[0], columns[1]);
        }

        System.out.println(map);
    }
}