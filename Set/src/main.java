import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        System.out.println("test file: \n");
        ArrayList<String> arr1=new ArrayList<>();
        FileOperation.readFile("test.txt",arr1);
        System.out.println("total words:"+arr1.size());
        BSTSet<String> bstSet=new BSTSet<>();
        for (String words:arr1
             ) {
            bstSet.add(words);
        }
        System.out.println("total different word "+bstSet.getSize());
    }
}
