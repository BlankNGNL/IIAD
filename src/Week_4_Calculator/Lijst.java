package Week_4_Calculator;

import java.util.NoSuchElementException;

public class Lijst {
    private Entry header;
    private int size;

    // Constructor voor een lege lijst

    // Constructor voor een lege lijst
    public Lijst() {
        header = new Entry(null, null, null);
        header.next = header;
        header.previous = header;
    }

    // Object vooraan toevoegen de lijst
    public void addFirst(Object o) {
        addBefore(o, header.next);
    }

    // Object achteraan toevoegen
    public void addLast(Object o) {
        addAfter(o, header);
    }

    public Object getFirstElement() {
        return header.next.getElement();
    }

    // Object vooraan opvragen
    public Entry getFirst() {
        return header.next;
    }

    //Object achteraan opvragen
    public Entry getLast() {
        return header.previous;
    }

    // Object vooraan verwijderen
    public Object removeFirst() {
        Object tempheader = getFirst().getElement();
        remove(getFirst());
        return tempheader;
    }

    // Object achteraan verwijderen
    public Object removeLast() {
        Object tempheader = getLast().getElement();
        remove(getLast());
        return tempheader;
    }


    // Aantal objecten in de lijst afleveren
    public int size() {

        return size;
    }

    // De lijst leegmaken
    public void clear() {
        while (size > 0) {
            remove(header.next);
        }
    }

    public boolean isEmpty() {
        if (size != 0) {
            return false;
        } else {
            return true;
        }
    }

    // Lever een iterator voor de lijst
    public Week_2.lineaire_lijst_versie_3.niet_uitgewerkt.Iterator iterator() {

        return new LItr();
    }

    // private methoden
    private void addBefore(Object o, Entry e) {
        Entry newEntry = new Entry(o, e, e.previous);
        newEntry.previous.next = newEntry;
        newEntry.next.previous = newEntry;
        size++;
    }

    private void addAfter(Object o, Entry e) {
        Entry newEntry = new Entry(o, e, e.previous);
        newEntry.previous.next = newEntry;
        newEntry.next.previous = newEntry;
        size++;
    }

    private void remove(Entry e) {
        if (e == header)
            throw new NoSuchElementException(
                    "Kan Entry niet verwijderen: is header");

        e.previous.next = e.next;
        e.next.previous = e.previous;
        size--;
    }

    // Inwendige klasse LItr
    private class LItr implements Week_2.lineaire_lijst_versie_3.niet_uitgewerkt.Iterator {
        private Entry pos = header;

        public boolean hasNext() {

            return pos.next != header;
        }

        public Object next() {
            pos = pos.next;
            return pos.element;
        }

        public boolean hasPrevious() {

            return pos.previous != header;
        }

        public Object previous() {
            pos = pos.previous;
            return pos.element;
        }
    } // Einde inwendige klasse LItr


    // Inwendige klasse Entry
    private class Entry {
        Object element;
        Entry next;
        Entry previous;

        Entry(Object element, Entry next, Entry previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }

        public Object getElement() {
            return element;
        }
    } // Einde inwendige klasse Entry

} // Einde klasse Lijst2.Week_4_Queue.Lijst2.Lijst
