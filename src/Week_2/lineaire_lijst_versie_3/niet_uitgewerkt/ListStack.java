package Week_2.lineaire_lijst_versie_3.niet_uitgewerkt;


public class ListStack implements Stack {

    private Lijst lijst;

    public ListStack(Lijst lijst) {
        this.lijst = lijst;
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
