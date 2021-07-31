public class LinkedList<E> {
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


    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);//very important, don't forget to do that!!!!!
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void Add(E e, int Index) {
        if (Index < 0 || Index > size)
            throw new IllegalArgumentException("index out of bound");
        Node prev = dummyHead;
        for (int i = 0; i < Index; i++)
            prev = prev.Nest;
        prev.Nest = new Node(e, prev.Nest);
        size++;
    }

    public void AddStart(E e) {
        Add(e, 0);
    }

    public void AddEnd(E e) {
        Add(e, size);
    }


    public E get(int Index) {
        if (Index < 0 || Index >= size)
            throw new IllegalArgumentException("Illegal Index");
        Node current = dummyHead.Nest;
        for (int i = 0; i < Index; i++)
            current = current.Nest;
        return current.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    public void set(E e, int Index) {
        if (Index < 0 || Index > size)
            throw new IllegalArgumentException("index out of bound");
        Node current = dummyHead.Nest;
        for (int i = 0; i < Index; i++)
            current = current.Nest;
        current.e = e;
    }

    public E remove(int Index) {
        if (Index < 0 || Index > size)
            throw new IllegalArgumentException("Illegal Index");
        Node prev=dummyHead;
        for (int i = 0; i < Index; i++)
            prev = prev.Nest;
       Node delNode=prev.Nest;
       prev.Nest=delNode.Nest;
       delNode.Nest=null;
       size--;
       return delNode.e;

    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public boolean Contains(E e) {
        Node current = dummyHead.Nest;
        while (current != null) {
            if (current.e.equals(e))
                return true;
            current = current.Nest;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("dummyHead->");
        Node current = dummyHead.Nest;
        while (current != null) {
            stringBuilder.append(current + "->");
            current = current.Nest;
        }
        stringBuilder.append("tail(null)");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

    final int n = 10;

        for (int i = 0; i < n; i++)
            linkedList.AddStart(5);
        System.out.println(linkedList);
        for (int i = 0; i < n; i++)
            linkedList.AddEnd(i);
        System.out.println(linkedList);
        System.out.println(linkedList.size);
        for (int i = 0; i < n; i++)
            linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println(linkedList.size);
        for (int i = 0; i < n; i++)
            linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(linkedList.size);
    }
}
