package Week_4_Queue;


public class ListDequeue implements Dequeue {
    Lijst list = new Lijst();

    @Override
    public void addFirst(Object o) {
        list.addFirst(o);
    }

    @Override
    public void addLast(Object o) {
        list.addLast(o);
    }

    @Override
    public Object removeFirst() {
        return list.removeFirst();
    }

    @Override
    public Object removeLast() {
        return list.removeLast();
    }

    @Override
    public Object getFirst() {
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
