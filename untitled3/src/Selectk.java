//找到第k大的元素
public class Selectk {
    private Selectk() {}
    public static int search(int[] arr, int k){
        int l=0,r=arr.length-1;k=arr.length-k;
        while(l<=r){
            int p=partition(arr,l,r);
            if (p==k)return arr[p];
            if (p>k){
                r=p-1;
            }else {
                l=p+1;
            }
        }
        return -1;
    }


    private static int partition(int[] arr, int l, int r) {
        int i = l + 1, j = r;
        //循环不变量 arr[l+1,i-1]<=v, arr[j+1,r]>=v
        while (true) {
            while (i<=j && arr[i] < arr[l]) {
                i++;
            }
            while (i>=j && arr[j] > arr[l]) {
                j--;
            }
            if (i >= j) break;
            swap(arr, i, j);
            i++;
            j--;
        }
        swap(arr, l, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 1, 3, 6, 4, 8, 9};
        int res = search(A, 1);
        System.out.println(res);
    }
}
