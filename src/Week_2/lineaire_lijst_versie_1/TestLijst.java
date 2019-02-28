package Week_2.lineaire_lijst_versie_1;

public class TestLijst 
{

	public static void main(String[] args) 
	{
	   Lijst mijnLijst = new Lijst();
           
	   mijnLijst.addFirst ("EEN");
	   mijnLijst.addFirst ("TWEE");
	   mijnLijst.addFirst ("DRIE");
	   mijnLijst.addFirst ("VIER");
	   
	   //System.out.println (mijnLijst.getFirst());
	   System.out.println (mijnLijst.removeFirst() + " is verwijderd");
	   System.out.println ("de lijst bevat nog: ");
       
       
       // nu de elementen benaderen met een iterator ..
       Iterator iter = mijnLijst.iterator(); // nieuw object.
       
       while (iter.hasNext())
    	  System.out.println (iter.next());
       
       
	}

}
