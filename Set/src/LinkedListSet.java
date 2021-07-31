public class LinkedListSet<E>implements Set<E> {
    private linked_list<E> list;
    public LinkedListSet(){
        list=new linked_list<>();
    }
    @Override
    public int getSize(){
        return list.getSize();
    }
    @Override
    public boolean contains(E e){
        return list.Contains(e);
    }
    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }
    @Override
    public void add(E e){
        if (!list.Contains(e))
            list.add_first(e);
    }
    @Override
    public void remove(E e){
        list.removeElement(e);
    }
}
