public class fibonacci {
    public long Fibo(int n){
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        return Fibo(n-2)+Fibo(n-1);
    }

    public static void main(String[] args) {
        long a=(new fibonacci()).Fibo(4);
        System.out.println(a);
    }
}
