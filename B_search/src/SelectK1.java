import java.util.Random;

public class SelectK1 {
    public int selectK1(int[] arr,int k){
        //循环不变量arr[l,r)
        Random random=new Random();
        return selectK1(arr,0,arr.length,k,random);

    }
    private  int selectK1(int[] arr, int l, int r, int k, Random random){
        int p=partition(arr,l,r,random);
        while(l<r){
            if (p==k)return arr[p];
            if (p<k){
                l=p+1;
            }else {
                r=p;
            }
        }
        throw new RuntimeException("could not find target in given array");
    }

    private  int partition(int[] arr,int l,int r,Random random){
        int p = l +random.nextInt(r - l + 1);
        swap(arr,l,p);
        int i=l+1, j=r;
        while(true){
            if (i<j && arr[i]<arr[l]){
                i++;
            }else if (i<j && arr[i]>arr[l]){
                j--;
            }
            if (i>=j) break;
            swap(arr,i,j);
            i++;
            j--;

        }
        swap(arr,l,j);
        return j;

    }
    private void swap(int[] arr, int i, int j){

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] A= {1,45,3,5,31,7,9};
        int p= (new SelectK1()).selectK1(A,0);
        System.out.println(p);
    }
}
