package Week_2.lineaire_lijst_versie_2.niet_uitgewerkt;
public class TestLijst
{
	
	public static void main(String[] args) 
	{
	   Lijst mijnLijst = new Lijst();
		mijnLijst.addFirst (new Werknemer ("Klaas"));
		mijnLijst.addLast (new Werknemer ("Henk"));
	   mijnLijst.addFirst (new Werknemer ("Jan"));
       mijnLijst.addFirst (new Werknemer ("Piet"));

		System.out.println("mijn laatste is: "+mijnLijst.getLast());
   
       // nu de elementen benaderen met een iterator ..
       
       Iterator iter = mijnLijst.iterator();
       
       while (iter.hasNext())
    	  System.out.println (iter.next());  
	}
}
