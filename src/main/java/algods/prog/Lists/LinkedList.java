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
        if (this.size > 0) {
            // Das letzte Element steht direkt VOR dem Anchor.
            // Wir sagen dem Anchor: "Lösche das Element vor dir".
            this.anchor.removeBefore(); 
            this.size--;
        }
    }

    /// Entfernt das Element an der gegebene Position aus der Liste.
    public void remove(int pos) {
        // TODO
        if (pos < 0 || pos >= this.size) {
            throw new IndexOutOfBoundsException("Index " + pos + " existiert nicht.");
        }

        // Wir suchen das Element, das NACH dem zu löschenden Element kommt.
        // Um Index 0 zu löschen, müssen wir also zu Index 1 (bzw. anchor.next.next) gehen.
        Element current = this.anchor.next;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }

        // Jetzt steht 'current' auf dem Element, das wir entfernen wollen? 
        // Nein, für 'removeBefore' müssen wir auf den Nachfolger zeigen:
        current.next.removeBefore();
        this.size--;
    }

    public int size() {
        return this.size;
    }
}