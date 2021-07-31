public class Solution4 {
	public static void main(String[] args) {
//		the complexity O(n)
        Solution4 solution = new Solution4();
        System.out.println(solution.cntPrimes(1000_000_000,2000_000_000));
        long max = 0;
        int idx = 0;

    }

    int cntPrimes(int a,int b){
        a -= 20;
        b -= 20;
        long idx = (int)Math.pow(a,1.0/2);
        int res =0;
        while (idx * idx <= b){
            if(isPrime(idx * idx)) res++;
            idx++;
        }
        return res;
    }
    boolean isPrime(long num) {
        if (num < 0 || num == 0 || num == 1)
            return false;
        else if (num == 2 || num == 3) {
            return true;
        }
        if ((num * num - 1) % 24 == 0) {
            return true;
        } else {
            return false;
        }
    }


}


