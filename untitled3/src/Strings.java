import java.util.Scanner;
public class Strings {

public static  String removeVowels(String test){
         return test.replaceAll("[aeiouAEIOU]","");
}
public  static String reverse(String test){
        int len=test.length();
        String str="";
        for(int i=len-1;i>=0;i--){
            str=str+test.charAt(i);
        }
        return str;
}
public  static String replace(String test,Character a,Character b){
    test=test.replace(a, b);
    return  test;
}
    public static void main(String[] args) {
        String s= "this is tesTstring";
        String s2 = removeVowels(s);
        Integer a=13231;
        System.out.println(a.toString());

//        System.out.println(s2);//ths s  tstTstng
//        System.out.println(reverse(s));//gnitseTtset a si siht
//        System.out.println(replace(s, 'i', 'x')); //thxs xs a testTestxng
    }
}