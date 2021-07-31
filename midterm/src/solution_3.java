import java.math.BigInteger;

public class solution_3 {
    public static void main(String[] args) {
        System.out.println((new solution_3()).run());
    }

    public static int pow(int x, int y) {
        if (x < 0)
            throw new IllegalArgumentException("Negative base not supported");
        if (y < 0)
            throw new IllegalArgumentException("Negative exponent");
        int z = 1;
        for (int i = 0; i < y; i++) {
            if (Integer.MAX_VALUE / z < x)
                throw new ArithmeticException("Overflow");
            z *= x;
        }
        return z;
    }

    private static final int LIMIT = pow(10, 6);

    public String run() {
        int maxArg = -1;
        int maxChain = 0;
        for (int i = 1; i < LIMIT; i++) {
            int chainLen = collatzChainLength(BigInteger.valueOf(i));
            if (chainLen > maxChain) {
                maxArg = i;
                maxChain = chainLen;
            }
        }
        return Integer.toString(maxArg);
    }


    // Can be set to any non-negative number, but there are diminishing returns as you go larger
    private static final BigInteger CACHE_SIZE = BigInteger.valueOf(LIMIT);

    // Memoization
    private int[] collatzChainLength = new int[CACHE_SIZE.intValue()];

    // Returns the Collatz chain length of the given integer with automatic caching.
    private int collatzChainLength(BigInteger n) {
        if (n.signum() < 0)
            throw new IllegalArgumentException();

        if (n.compareTo(CACHE_SIZE) >= 0)  // Caching not available
            return collatzChainLengthDirect(n);

        int index = n.intValue();  // Index in the cache
        if (collatzChainLength[index] == 0)
            collatzChainLength[index] = collatzChainLengthDirect(n);
        return collatzChainLength[index];
    }



    private int collatzChainLengthDirect(BigInteger n) {
        if (n.equals(BigInteger.ONE))
            return 1;
        else if (!n.testBit(0))
            return collatzChainLength(n.shiftRight(1)) + 1;
        else
            return collatzChainLength(n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE)) + 1;
    }
}
