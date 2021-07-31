import java.math.*;
public class gcd_adv {
public static int gcd(int a,int b){
    while(b != 0)
    {
        int r = b;
        b = a % b;
        a = r;
    }
    return a;
}
private static int power(int a,int b){
    int prod=1;
    while(b>0){
        if(b%2==1)
            prod=prod*a;
        a=a*a;
        b=b/2;
    }
return prod;
}
public static int powerMod(int a,int b,int r){
    int prod=1;
    while(b>0){
        if (b%2==1) {
            prod = prod * a % r;
        }
        a=a*a%r;
        b=b/2;
    }
    return prod;
}

    static boolean isPrime(int n, int k)
    {
        // Corner cases
        if (n <= 1 || n == 4) return false;
        if (n <= 3) return true;

        // Try k times
        while (k > 0)
        {
            // Pick a random number in [2..n-2]
            // Above corner cases make sure that n > 4
            int a = 2 + (int)(Math.random() % (n - 4));

            // Fermat's little theorem
            if (powerMod(a, n - 1, n) != 1)
                return false;

            k--;
        }

        return true;
    }
    public static void main(String[] args) {
//        System.out.println(gcd(4,5));
//        System.out.println(power(2,5));
//        System.out.println(powerMod(2,5,7));
        System.out.println(isPrime(45,100));
    }

}
