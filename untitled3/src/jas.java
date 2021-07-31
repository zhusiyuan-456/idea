public class jas {
  public static double factorial(short n){
      double f=1;
      for(int i=1;i<=n;i++){
          f*=i;
      }
      return f;
  }
  public static void main(String arg[]){
   
      double q=factorial((short)12);
      System.out.println(q);
  }
}


