import java.math.BigInteger;

public class solution_2 {
    public static void main(String[] args) {
        System.out.println(test());
    }


    public static String test() {
        BigInteger modulus = BigInteger.TEN.pow(10);
        BigInteger n = BigInteger.valueOf(2).modPow(BigInteger.valueOf(7830457), modulus);
        n = n.multiply(BigInteger.valueOf(28433)).mod(modulus);
        n = n.add(BigInteger.ONE).mod(modulus);
        return String.format("%010d", n);
    }
}
