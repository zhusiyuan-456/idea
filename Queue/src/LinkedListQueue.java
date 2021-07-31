public class LinkedListQueue<E> implements Queue<E> {
    private class Node {
        public E e;
        public Node Nest;

        public Node(E e, Node Nest) {
            this.e = e;
            this.Nest = Nest;
        }

        public Node(E e) {
            this.e = e;
            Nest = null;
        }

        public Node() {
            e = null;
            Nest = null;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head,tail;
    private int size;
    public LinkedListQueue(){
        head=null;
        tail=null;
        size=0;
    }
    @Override
    public int getSize(){
        return size;
    }
    @Override
    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public E dequeue(){
        if (size==0)
            throw new IllegalArgumentException("the queue is empty");
        Node ret=head;
        head=ret.Nest;
        ret.Nest=null;
        size--;
        return ret.e;
    }
    @Override
    public void enqueue(E e){
        if (tail==null){
            tail=new Node(e);
            head=tail;
        }else{
            tail.Nest=new Node(e);
            tail=tail.Nest;
        }
        size++;
    }
    @Override
    public E getFront(){
        return head.e;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("LinkedListQueue: front");
        Node cur = head;
        while (cur != null) {
            s.append("->" + cur.e);
            cur = cur.Nest;
        }
        s.append("->Tail");
        return s.toString();
    }


    public static void main(String[] args) {
        LinkedListQueue<Integer> li=new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            li.enqueue(i);
        }
        System.out.println(li);
        for (int i = 0; i < 10; i++) { 
           if (i%3==2)
                li.dequeue();
        }
        System.out.println(li);
    }
}
