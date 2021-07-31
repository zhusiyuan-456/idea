package gg;
import java.io.*;
import java.util.*;
public class FileReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(
                        new java.io.FileReader("test.txt"));

        HashMap<String, Integer> source = new HashMap<>();
        int count = 0;
        String line;
        while((line=br.readLine())!= null){
            source.put(line,null);
        }
        System.out.println(source);
    }
}
