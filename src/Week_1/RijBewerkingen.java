package Week_1;


public class RijBewerkingen
{
	private char [] rij;
	private boolean found;
	private  int pos;
	
	// constructor
	public RijBewerkingen (char [] rij)
	{
		this.rij = rij;
	}
	
	
	// als target voor komt in de tabel dan wordt de index van target teruggegeven
	// als target niet voor komt dan wordt -1 teruggegeven.
	
	public int lineair_zoeken(char target)
	{
		for (int i = 0; i < rij.length; i++) {
			if (rij[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	
	// als target voor komt in de gesorteerde tabel dan wordt de index van target 
	// teruggegeven; als target niet voor komt dan -1.
	
	public int binair_zoeken(char target)
	{
		int max = rij.length - 1;
		int min = 0;
		int middle = (max + min)/2;

		while(min <= max) {;
			if(rij[middle] < target) {
				min = middle + 1;
			} else if(rij[middle] == target) {
				return middle;
			} else {
				max = middle - 1;
			}
			middle = (max + min)/2;
		}
		return -1;
	}
	
	
	
	// de tabel wordt in oplopende volgorde gesorteerd
	// mbv de 'bubble-sort'-methode
	
	public void bubble ()
	{
		for(int i = 0; i < rij.length -1; i++) {
			for(int j = 0; j < rij.length - i - 1; j++) {
				if(rij[j] > rij[j +1]) {
					char temp = rij[j];
					rij[j]= rij[j+1];
					rij[j+1] = temp;
				}
			}
		}
	}
	
	
	
	public void print ()
	{
		for (int te = 0; te < rij.length; te++)
			System.out.print(rij[te] + "  ");
		System.out.println ("\n\n\n");
	}
	
}