package Week_4_Queue;


public class ListDequeueTest {
    public static void main(String[] args) {
        Object o1 = new String("Hallo");
        Object o2 = new String("dasdasdasdasdasdasdsd");
        Object o3 = new String ("smint");

        ListDequeue list = new ListDequeue();

        list.addFirst(o1);
        list.addFirst(o2);
        list.addFirst(o3);
        list.removeFirst();

        Iterator iterator = (Iterator) list.list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
