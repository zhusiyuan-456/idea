public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.AddStart(i);
            System.out.println(linkedList);
        }
        linkedList.Add(666,2);
        System.out.println(linkedList);
    }


}
