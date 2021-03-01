package uaslp.ingenieria.labs.list;
//Lista doblemente ligada
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    /**
     * Insert data at the end of the list
     *
     * @param dato Data to be inserted
     */

    public void Inserta(int dato){
        Node nodo = new Node(dato);

        nodo.setPrevious(tail);

        //Si la cola tiene un dato, apunta al nuevo nodo
        if( tail != null){
            tail.setNext(nodo);
        }

        //Si la cabecera esta vacia, que apunte al nuevo noto / lista vacia
        if( head == null ){
            head = nodo;
        }

        tail = nodo;
        size++;

    }

    /**
     * @param index 0-index
     * @return data in index
     */
    public int get(int index){
        Node currentNode = head;
        int currentIndex =0;

        while(currentIndex < index){
            currentNode = currentNode.getNext();
            currentIndex++;
        }

        return currentNode.getData();
    }

    public void delete(int index) {
        Node currentNode = head;
        int currentIndex = 0;

        //Si no lo encuentra
        if (index < 0 || index >= size) {
            return;
        }

        size--;

        //Si no hay nada en la lista
        if (size == 0) {
            head = null;
            tail = null;
            return;
        }

        //si es el primer dato de la lista
        if(index == 0){
            head = head.getNext();
            head.setPrevious(null);
        }

        //Es el ultimo dato de la lista
        if (index == size) {
            tail = tail.getPrevious();
            tail.setNext(null);
        }

        //recorre la lista dentro de los limites de esta
        if (index > 0 && index < size) {
            while (currentIndex < index) {
                currentNode = currentNode.getNext();
                currentIndex++;
            }

            //esta parte aun no me queda clara...
            currentNode.getPrevious().setNext(currentNode.getNext());
            currentNode.getNext().setPrevious(currentNode.getPrevious());
        }

        //Iterador Patron de diseño

        /*public int getSize(){
            return size;
        }*/

    }
}











