import java.util.HashSet;

public class solution8 {
         

        
            public static void main(String[] args) {
                String s="hello,world";
               
                HashSet<Character> set = new HashSet<>();
                StringBuilder sb = new StringBuilder();
                for(int i =0; i <s.length();++i){
                    Character c = Character.valueOf(s.charAt(i));
                    if(!set.contains(c)){
                        set.add(c);
                        sb.append(c);
                    }
                }
                System.out.println(sb.toString());
    }
}

//the complexity is 0(n)