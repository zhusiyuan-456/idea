package power;

public class power {
    public static double myPow(double x, int n) {
        double sum1=1;
        if(n>=0){
            for(int i=0;i<n;i++)
                sum1*=x;
        }
        if(n<0){
            n=-n;
            for(int i=0;i<n;i++ ){
                sum1*=x;
            }
            sum1=1/sum1;
        }
        return sum1;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
        double a=2;
        System.out.println(1/a);
    }
}
