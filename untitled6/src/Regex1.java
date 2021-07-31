import java.util.regex.*;
public class Regex1 {
    public static void main(String[] args) {
        String s="Search me i'm a pattern !fuck";
        Pattern p=Pattern.compile("a\\s+(\\w+)");
        Matcher m=p.matcher(s);
        while (m.find()){
            System.out.println(m.group(1));
            s=s.substring(m.end());
        }
    }
}
