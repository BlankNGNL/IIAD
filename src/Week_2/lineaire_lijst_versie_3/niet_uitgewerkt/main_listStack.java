package Week_2.lineaire_lijst_versie_3.niet_uitgewerkt;


public class main_listStack {
    public static void main(String args[]) {
        Lijst lijst = new Lijst();
        ListStack stack = new ListStack(lijst);

        System.out.println("is the list empty? " + stack.isEmpty());

        stack.push("Eerste Object gaat erin ");
        stack.push("Tweede Object");
        stack.push("Derde Object");

        System.out.println("Stack is nu " + stack.size() + " groot");

        System.out.println("Bovenste is: " + stack.peek());


        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println("CANT REMOVE ");;
        }

        System.out.println(stack.peek());

        System.out.println("Grootte is nu: " + stack.size());
    }
}
