public class LinkedListStack<E> implements Stack<E> {
    private LinkedList<E> linkedList;

    public LinkedListStack() {
        linkedList = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
    @Override
    public void push(E e){
        linkedList.AddStart(e);
    }
    @Override
    public E pop(){
      return   linkedList.removeFirst();
    }
    @Override
    public E peek(){
        return linkedList.getFirst();
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack: Top ");
        stringBuilder.append(linkedList);

        return stringBuilder.toString();
    }
}
