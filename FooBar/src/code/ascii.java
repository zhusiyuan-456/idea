package code;

public class ascii {
    public static void main(String[] args) {

        char a='a';
        char b='b';
        char c='c';
        char d='d';
        char r='r';
        System.out.println(convert(a));
        System.out.println(convert(b));
        System.out.println(convert(c));
        System.out.println(convert(d));
        System.out.println(convert(r));
/**
 capitalization=000001;

 a=100000;32
 b=110000;32+16=48
 c=100100;
 d=100110;
 e=100010;

 r=111010;


 */



    }

    public static int convert(char Char){
        int result=(int)Char;
        return result;
    }




}
