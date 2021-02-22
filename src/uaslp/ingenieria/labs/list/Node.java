package uaslp.ingenieria.labs.list;

class Node {
    int dato;
    LinkedList next;
    LinkedList previous;

    void setDato(int dato){
        this.dato = dato;
    }

    void setNext(LinkedList next){
        this.next = next;
    }

    void setPrevious(LinkedList previous){
        this.previous = previous;
    }

    int getDato() {
        return dato;
    }

    LinkedList getNext() {
        return next;
    }

    LinkedList getPrevious() {
        return previous;
    }

}
