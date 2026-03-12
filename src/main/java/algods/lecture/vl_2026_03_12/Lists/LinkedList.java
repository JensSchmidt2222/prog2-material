package algods.lecture.vl_2026_03_12.Lists;

public class LinkedList {
    Element anchor;
    int size;

    public LinkedList() {
        this.anchor = new Element();
    }

    /// Hängt einen neuen Wert am Ende der Liste an.
    public void add(int data) {
        this.anchor.insertBefore(data);
        this.size++;
    }

    /// Fügt ein neues Element mit dem gegebenen Wert an der gegeben Position in die
    /// Liste ein.
    public void insert(int pos, int data) {
        Element current = this.anchor.next;

        while (pos > 0) {
            current = current.next;
            pos--;
        }
        current.insertBefore(data);
        this.size++;
    }

    /// Entfernt das letzte Element aus der Liste.
    public void remove_last() {
        // TODO
    }

    /// Entfernt das Element an der gegebene Position aus der Liste.
    public void remove(int pos) {
        // TODO
    }

    public int size() {
        return this.size;
    }
}
