//
//    import java.util.*;
//
//    public class solution6 {
//        public static void main(String[] args){
//
//
//        int count = 0;
//        System.out.println("how many rectangles?");
//
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        System.out.println("input xywh");
//
//        ArrayList<Integer>[]al =new ArrayList[n];
//
//        for(int i =0;i<n;i++){
//            int x = s.nextInt();
//            int y = s.nextInt();
//            int w = s.nextInt();
//            int h = s.nextInt();
//            al[i].add(x);
//            al[i].add(y);
//            al[i].add(w);
//            al[i].add(h);
//            count++;
//            System.out.println("nth rect+count")
//
//        }
//
//
//        for(int i =0; i<n;i++){
//            for(int j=0;j<al[i].size();j++){
//                System.out.println(al[i].get(j)+" ");
//            }
//                System.out.println();
//            }
//        public static int  inersect (int count) {
//
//
//            for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(!(i[2] <= j[0] || j[2] <= i[0]&& !(i[3] <= j[1] || j[3] <= i[1])
//                //this metod has bug ,we cant solve it
//                count+=1;
//            }
//            }
//            }
//    }
//
//
//
//
//        }
//    }
//
//
