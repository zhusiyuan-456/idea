import java.util.ArrayList;
import java.util.Arrays;

public class RunLength_Encoding {
        public static String printRLE(String s)
        {
            if(s == null || s.length() == 0)    return "";
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                int count = 1;
                while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                    i++;
                }
                sb.append(s.charAt(i)).append(count);

            }
            return sb.toString();
        }

        public static void main(String[] args)
        {
            String str = "wwwwaaadexxxxxxywww";
            System.out.println(printRLE(str));
        }
    }

