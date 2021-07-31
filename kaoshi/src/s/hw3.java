package s;
import java.util.Scanner;


class  hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("please enter 3 numbers：");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r = scanner.nextInt();
		int Big = gcd(a,b);
        int Mul = lcm(a,b);
        int Pow = powerMod(a,b,r);
		System.out.println("lcm：" + Big);
        System.out.println("gcd：" + Mul);
        System.out.println("powermod "+Pow);
		scanner.close();
        }

	public static int gcd(int num1,int num2){
		if (num1%num2==0)
			return num2;
		else if (num1>num2)
			return gcd(num1 - num2, num2);
		return gcd(num2-num1,num1);
	}
	public static int lcm(int a,int b) {
		return a * b /gcd(a,b);
	}

    public static int powerMod(int a,int b,int c){
        int res=1;
        a=a%c;
        while(b>0){
            if(b%2==1){
                res=res*a%c;
            }
            b/=2;
            a=a*a%c;
        }
        return res;}
}