package Week_2.lineaire_lijst_versie_1;
public class Lijst
{

    private Entry header;
    private Entry tail;
    // Entry is een inwendige klasse van Lijst
	
	public Lijst ()
	{
		header = null;
	}
	
	public Iterator iterator ()
	{
		return (new LijstIterator()); 
	    // LijstIterator is een inwendige klasse van Lijst
	}
	
	public void addFirst (Object o)
	{

		header = new Entry (o, header);
		if (tail == null){
			tail = header;
		}

	}

    public Object getFirst()
    {
    	Iterator iter = iterator();
    	if (!iter.hasNext())
    		return null;
        else
        {
           return (iter.next());	
        }
    }
    
    public Object removeFirst()
    {
    	if (header == null)
    		return (null);
    	else
    	{
    		Object tmp = header.element;
    		header = header.next;
    		return (tmp);
    	}
    }
	
	// inwendige klasse LijstIterator
	private class LijstIterator implements Iterator
	{
		private Entry pos = header; 
        // pos houdt de huidige positie bij in een lijstobject
		
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
		private Object element;
		private Entry next;
		
		Entry (Object element, Entry next)
		{
			this.element = element;
			this.next = next;
		}
	} 

}
