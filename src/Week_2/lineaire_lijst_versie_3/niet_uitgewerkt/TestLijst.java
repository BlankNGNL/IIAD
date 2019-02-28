package Week_2.lineaire_lijst_versie_3.niet_uitgewerkt;
public class TestLijst
{

  public static void main( String args[] ) 
  {
    Lijst lijst = new Lijst();
    
    lijst.addFirst( "Een" );
    lijst.addFirst( "Twee" );
    lijst.addFirst( "Drie" );
//    lijst.addLast("Vier");
    
    System.out.println(lijst.removeFirst() + " is verwijderd");
    
    Iterator iter = lijst.iterator();
    
    while( iter.hasNext() ) 
      System.out.println( iter.next() );
    
    System.out.println("\n En nu omgekeerd : \n");

    Iterator backiter = lijst.iterator();
    while( backiter.hasPrevious() ) 
      System.out.println( backiter.previous() );
  }
}






