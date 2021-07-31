
public class linked_list<E> {

    private class Node {
        private E e;
        private Node next;

        public Node(E e, Node next) {
            this.next = next;
            this.e = e;
        }

        public Node(E e) {
            this.e = e;
            next = null;
        }

        public Node() {
            e = null;
            next = null;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private int size = 0;
    private Node dummyHead;

    public linked_list() {
        dummyHead = new Node(null, null);
    }

    public void add(E e, int Index) {
        if (Index < 0 || Index > size)
            throw new IllegalArgumentException("Illegal Index");
        Node previous = dummyHead;
        for (int i = 0; i < Index; i++)
            previous = previous.next;
        previous.next = new Node(e, previous.next);
        size++;
    }

    public void add_first(E e) {
        add(e, 0);
    }

    public void add_last(E e) {
        add(e, size);
    }
    public int getSize(){
        return size;
    }

    public boolean Contains(E e) {
        Node current = dummyHead.next;
        while (current != null) {
            if (current.e.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public E remove(int Index) {
        if (Index < 0 || Index > size)
            throw new IllegalArgumentException("Illegal Index");
        Node prev = dummyHead;
        for (int i = 0; i < Index; i++)
            prev = prev.next;
        Node delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size--;
        return delNode.e;

    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("head ");
        Node cur = dummyHead.next;
        while (cur != null) {
            s.append("->" + cur.e);
            cur = cur.next;
        }
        s.append("->null");
        return s.toString();
    }

    public void removeElement(E e){

        Node prev = dummyHead;
        while(prev.next != null){
            if(prev.next.e.equals(e))
                break;
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size --;
        }
    }

    public static void main(String[] args) {
        linked_list<Integer> linkedList = new linked_list<>();
        final int n = 15;

        for (int i = 0; i < n; i++)
            linkedList.add_first(5);
        System.out.println(linkedList);
        for (int i = 0; i < n; i++)
            linkedList.add_last(i);
        System.out.println(linkedList);
        for (int i = 0; i < n; i++)
            linkedList.removeFirst();
        System.out.println(linkedList);
        for (int i = 0; i < n; i++)
            linkedList.removeLast();
        System.out.println(linkedList);
    }

}
