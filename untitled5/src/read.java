import java.io.*;
import java.util.*;


class Test
{
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileReader("C:\\Users\\absno\\Desktop\\score.txt"));

        HashMap<String, t> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String[] columns = scanner.nextLine().split("\t\t");
            map.put(columns[0], columns[1]);
        }

        Set<String>set=map.keySet();
        for(String key:set){
            t value
        }
    }
}