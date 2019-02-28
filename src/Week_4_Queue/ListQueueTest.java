package Week_4_Queue;


public class ListQueueTest {
    public static void main(String[] args) {
       Object object1 = new String("ahahhahaah");
        Object object2 = new Integer(1);
        ListQueue queue = new ListQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue("testz");

        Object firstObject = queue.dequeue();

        System.out.println(firstObject.toString());
    }
}
