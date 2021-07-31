import java.util.regex.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExtractClasses {
    public static void main(String[] args) throws IOException {
        args[0] = "class1.java";
        args[1] = "class2.java";
        for (int i = 0; i < 1; i++) {
            BufferedReader lineReader = new BufferedReader(new FileReader(args[i]));
            String lineText = null;
            List<String> listLines = new ArrayList<String>();
            while ((lineText = lineReader.readLine()) != null) {
                listLines.add(lineText);
            }
            lineReader.close();

            Pattern p = Pattern.compile("class|interface\\s+(\\w+([a-zA-Z][a-zA-Z0-9]))*");
            Matcher m = p.matcher(lineText);
            while (m.find()) {
                System.out.println(m.group(1));
                lineText = lineText.substring(m.end());
            }

        }
    }
}
