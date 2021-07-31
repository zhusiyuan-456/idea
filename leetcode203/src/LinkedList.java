public class LinkedList {

    public class Node {
        private int val;
        private Node next;

        public Node() {
            this.next = null;
            this.val = -1;
        }

        public Node(int val) {
            this.next = null;
            this.val = val;
        }

        public Node(Node node, int val) {
            this.next = node;
            this.val = val;
        }


    }

    Node dummyHead,tail;
    int size;

    public LinkedList() {
        dummyHead = new Node();
        tail=dummyHead;
        size = 0;
    }

    public void addStart(int val){
        if (dummyHead.next==null) {
            dummyHead.next = new Node(val);
        }else {
        dummyHead.next=new Node(dummyHead.next,val);
        }
        tail=tail.next;
    }
    public void addEnd(int val){
        if (dummyHead.next==null){
            dummyHead.next=new Node(val);
        }else {
            tail.next=new Node(val);
        }
            tail=tail.next;

    }
    public void removeStart(){
        if (dummyHead.next==null)
            throw new IllegalArgumentException("can't remove element from an empty list");
        else{
            dummyHead.next=dummyHead.next.next;
        }
    }
    public void removeEnd(){
        if (dummyHead.next==null)
            throw new IllegalArgumentException("can't remove element from an empty list");
        else{
            Node prev=dummyHead;
            while (prev.next.next!=null){
                prev=prev.next;
            }
            prev.next=null;
            tail=prev;
        }
    }



    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("head ");
        Node cur = dummyHead.next;
        while (cur != null) {
            s.append(cur.val + "->");
            cur = cur.next;
        }
        s.append("Null");
        return s.toString();
    }

    public static void main(String[] args) {
        LinkedList s = new LinkedList();
        for (int i=0;i<10;i++)
            s.addEnd(i);
        System.out.println(s);
        for (int i=0;i<5;i++)
            s.removeEnd();
        System.out.println(s);
        for (int i=0;i<3;i++)
            s.removeStart();
        System.out.println(s);
    }
}
