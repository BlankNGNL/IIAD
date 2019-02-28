package Week_4_Queue;


public class ListStack implements Stack{
    private Lijst lijst;

    public ListStack() {
        lijst = new Lijst();
    }

    @Override
    public void push(Object o) {
        lijst.addFirst(o);
    }

    @Override
    public Object pop() {
        return lijst.removeFirst();
    }

    @Override
    public Object peek() {
        return lijst.getFirstElement();
    }

    @Override
    public int size() {
        return lijst.size();
    }

    @Override
    public boolean isEmpty() {
        return lijst.isEmpty();
    }
}
