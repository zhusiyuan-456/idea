public class solution_1 {
    public static void main(String[] args) {
        System.out.println(run());
    }
    public static boolean isPrime(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Negative number");
        if (x == 0 || x == 1)
            return false;
        else if (x == 2)
            return true;
        else {
            if (x % 2 == 0)
                return false;
            for (int i = 3, end = sqrt(x); i <= end; i += 2) {
                if (x % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static int sqrt(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Square root of negative number");
        int y = 0;
        for (int i = 1 << 15; i != 0; i >>>= 1) {
            y |= i;
            if (y > 46340 || y * y > x)
                y ^= i;
        }
        return y;
    }

    public static String run() {
        long sum = 0;
        for (int count = 0, n = 10; count < 11; n++) {
            if (isTruncatablePrime(n)) {
                sum += n;
                count++;
            }
        }
        return Long.toString(sum);
    }


    private static boolean isTruncatablePrime(int n) {
        // Test if left-truncatable
        for (long i = 10; i <= n; i *= 10) {
            if (!isPrime(n % (int)i))
                return false;
        }

        // Test if right-truncatable
        for (; n != 0; n /= 10) {
            if (!isPrime(n))
                return false;
        }

        return true;
    }
}
