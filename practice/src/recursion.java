public class recursion {

   static  int  sum(int n){
        if(n<= 1){
            return 1;
        }

        return n+sum(n-1);
    }
public static double hello(int q){
       return q*q;
}
public static double hi(int k){
       return k;
}

    public static  void main(String[] args){
        System.out.println(sum(3));
        System.out.println(hello(43));
        recursion re=new recursion();
        System.out.println(hi(5));
    }
}
