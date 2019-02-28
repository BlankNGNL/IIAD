package Week_4_Boom;
public class Boom {

    public static void main(String[] args) {
        // Generic class Parameterized with String
        BKnoop<String> aap = new BKnoop<String>("aap");

        BKnoop<String> noot = new BKnoop<String>("noot");
        BKnoop<String> mies = new BKnoop<String>("mies");
        BKnoop<String> wim = new BKnoop<String>("wim");

        //2 nodes toevoegen na de root, links noot en rechts mies
        aap.add(noot);
        aap.add(mies);
        //linker parent "noot" krijgt wim node links
        noot.add(wim);
        //Linker parent node "wim" krijgt Kek links
        wim.add(new BKnoop<String>("Kek"));
        //linker parent node "noot"krijgt jet rechts
        noot.add(new BKnoop<String>("Jet"));

        System.out.print("PRE : ");
        aap.printPreOrder(aap);
        System.out.print("\nPOST: ");
        aap.printPostOrder(aap);
        System.out.print("\nIN  : ");
        aap.printInOrder(aap);

       System.out.println("\n Aantal knopen : " + aap.aantalKnopen());
        System.out.println("\n Aantal leafs : " + aap.aantalBlad());
        System.out.print("\n Aantal diep: " + aap.diepte(aap));


    }



}