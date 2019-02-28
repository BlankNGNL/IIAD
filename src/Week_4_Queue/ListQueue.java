package Week_4_Queue;


public class ListQueue implements Queue {
    Lijst list = new Lijst();

    @Override
    public void enqueue(Object o) {
        list.addLast(o);
    }

    @Override
    public Object dequeue() {
        return list.removeFirst();
    }

    @Override
    public Object front() {
        return list.getFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
