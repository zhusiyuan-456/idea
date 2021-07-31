import java.util.Scanner;

public class  hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("please enter 2 numbers：");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int Big = gcd(a,b);
        int Mul = lcm(a,b);
        int Pow = powermod(a,b);
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
  
    private static int powermod(int a, int b) {
    int res = 1;                     
    int base = a;                    
    while(b != 0) {                  
        if ((b&1) == 1) {            
            res = res * base;        
        }                            
        base = base * base;          
        b = b >> 1;                  
    }                                
    return res;                      
}             
}