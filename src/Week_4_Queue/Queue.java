package Week_4_Queue;


public interface Queue {
    public void enqueue( Object o);
    public Object dequeue();
    public Object front();
    public int size();
    public boolean isEmpty();
}
