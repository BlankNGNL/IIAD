package Week_2.lineaire_lijst_versie_2.niet_uitgewerkt;
public class Lijst
{
    private Entry header;
    private Entry tail;

    private int size;


	public Lijst ()
	{
		header = null;
        tail = null;
        size = 0;
	}

	public Iterator iterator ()
	{
		return (new LijstIterator());
	}

	public void addFirst (Object o)
	{
		header = new Entry(o, header);
		if (tail == null){ //De eerste entry is gelijk ook gelijk de tail
			tail = header;
		}
	}

	public Object getLast(){
		if (tail == null)
			return null;
		else{
			return tail.element;
		}
	}

    public void addLast (Object o){
    	Entry temp = tail; // Tijdelijk opslaan om een normale entry te worden
		tail = new Entry (o,null); // Geen volgende referentie van een entry
		temp.next = tail; // Is de uiteindelijk de tail

    }

	// inwendige klasse LijstIterator
	private class LijstIterator implements Iterator
	{
	    Entry pos = header; // pos houdt de huidige positie bij in een lijstobject

		public boolean hasNext()
		{
			return (pos != null);
		}
		public Object next()
		{
			Entry temp = pos;
			pos = temp.next;
			return (temp.element);
		}
	}

	// inwendige klasse Entry
	private class Entry
	{
		Object element;
		Entry next;

		Entry (Object element, Entry next)
		{
			this.element = element;
			this.next = next;
		}
	}
}
