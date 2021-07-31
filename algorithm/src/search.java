public class search {

    static void find(String pat,String txt){
        int m=txt.length();
        int n=pat.length();
      for (int i=0;i<m-n;i++){
          int j;
          for ( j=0;j<n;j++)
              if(pat.charAt(j)!=txt.charAt(i+j))
                  break;
              if (j==n)
                  System.out.println("found at "+i);
              int a[]={};
      }


    }


    public static void main(String[] args) {
        String txt = "BBACDACBACBACBDAABACHJDASLKDALAABAC";
        String pat = "AABAC";
        find(pat, txt);
    }

}
