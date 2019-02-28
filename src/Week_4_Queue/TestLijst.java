package Week_4_Queue;

public class TestLijst {

    public static void main(String args[]) {
        Lijst lijst = new Lijst();

        lijst.addFirst("Een");
        lijst.addLast("SADAASSDSAD");
        lijst.addFirst("Twee");
        lijst.addFirst("Drie");
        lijst.addFirst("420");
        lijst.addLast("Vierrr");

        Iterator iter = lijst.iterator();

        while (iter.hasNext())
            System.out.println(iter.next());

        lijst.removeLast();
        //lijst.removeFirst();

        Iterator iter2 = lijst.iterator();
        System.out.println("Na het verwijderen laatste: ");
        while (iter2.hasNext())
            System.out.println(iter2.next());

        System.out.println("\n En nu omgekeerd : \n");

        Iterator backiter = lijst.iterator();
        while (backiter.hasPrevious())
            System.out.println(backiter.previous());


        System.out.println("grootte lijst voor clear: " + lijst.size());
        lijst.clear();
        System.out.println("grootte na clear: " + lijst.size());
    }
}






