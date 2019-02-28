package Week_4_Queue;


public interface Dequeue {
    public void addFirst(Object o);
    public void addLast(Object o);
    public Object removeFirst();
    public Object removeLast();
    public Object getFirst();
    public int size();
    public boolean isEmpty();
}
