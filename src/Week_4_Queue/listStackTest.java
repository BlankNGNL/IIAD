package Week_4_Queue;


public class listStackTest {
    public static void main(String args[]) {
        ListStack stack = new ListStack();

        System.out.println("is the list empty? " + stack.isEmpty());

        stack.push("Dit is eerste die erin gaat");
        stack.push("tweede");
        stack.push("triple");

        System.out.println("Stack is nu " + stack.size() + " groot");

        System.out.println("Bovenste is: " + stack.peek());


        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println("CANT REMOVE BRUH");;
        }

        System.out.println(stack.peek());

        System.out.println("Grootte is nu: " + stack.size());
    }
}
