package LinerSearch;

public class LinearSearch {
    private LinearSearch() {
    }

    public static <T> int linear_search(T[] arr, T x) {
        for (int i = 0; i < arr.length ; i++)
            if (arr[i].equals(x))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] date={10000000,100000000};


       for (int n:date) {
           Integer[] arr = ArrayGenerator.GenerateOrderedArray(n);
           long startTime=System.nanoTime();
           linear_search(arr, n);
           long endTime = System.nanoTime();
           double time = endTime - startTime;
           System.out.println(time / 1000000000.0 + " s");
       }
       // remember use .0 to compute float point;}

//        Integer[] arr = new Integer[]{12, 32, 45, 67, 23, 56, 34};
//        int a = linear_search(arr, 23);
//        System.out.println(a);
//        int res = LinearSearch.linear_search(arr, 19);
//        System.out.println(res);

//        Student[] students = {new Student("peter", 1),
//                new Student("alice", 2),
//                new Student("michel", 3)};
//        Student peter=new Student("michel",3);
//        int res2=linear_search(students,peter);
//        System.out.println(res2);
    }
}
