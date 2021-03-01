package uaslp.ingenieria.labs.list;

import javax.xml.stream.events.NotationDeclaration;

//Lista doblemente ligada
public class LinkedList {

    public static final int BEFORE = 0;
    public static final int AFTER = 0;


    private Node head;
    private Node tail;
    private int size;

    /**
     * Insert data at the end of the list
     *
     * @param dato Data to be inserted
     */
    //sele agrego inserta al final
    public void add(int dato) {
        Node nodo = new Node(dato);

        nodo.setPrevious(tail);

        //Si la cola tiene un dato, apunta al nuevo nodo
        if (tail != null) {
            tail.setNext(nodo);
        }

        //lista vacia o final de la lista
        if (head == null) {
            head = nodo;
        } /*else {
            Node currentnode = head;
            while (currentnode.getNext() != null) {
                currentnode.setNext(currentnode);
            }
            currentnode.setNext(nodo);
        }*/
        tail = nodo;
        size++;

    }

    /**
     * @param index 0-index
     * @return data in index
     */
    public int get(int index) {
        Node currentNode = head;
        int currentIndex = 0;

        while (currentIndex < index) {
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
        if (index == 0) {
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
            currentNode.getPrevious().setNext(currentNode.getNext());
            currentNode.getNext().setPrevious(currentNode.getPrevious());
        }

    }

    //Se agrega el iterador
    public Iterador getIterador() {
        return new Iterador(head);
    }

    public void insert(int data, int position, Iterador it) {
        //que ofrece Java para restringir los valores de position a solamente BEFORE and AFTER
        Node newNode = new Node(data);
        Node currentnode = it.getCurrentnode();

        if (position == AFTER) {
            newNode.setNext(currentnode.getNext());
            newNode.setPrevious(currentnode);
            currentnode.setNext(newNode);
            if (newNode.getNext() != null) {
                newNode.getNext().setPrevious(newNode);
            } else {
                tail = newNode;
            }
        } else if (position == BEFORE) {
            newNode.setPrevious(currentnode.getPrevious());
            newNode.setNext(currentnode);
            currentnode.setPrevious(newNode);
            if (newNode.getPrevious() != null) {
                newNode.getPrevious().setPrevious(newNode);
            } else {
                head = newNode;
            }
        } else {
            System.out.println(" No se encuentra la posicion ");
        }
        size++;
    }

    public int getSize() {
        return size;
    }


    public ReverseIterator getReverseIterator() {
        return new ReverseIterator(tail);
    }

    /* Opción alternativa de como regresar el tamaño de la lista
    public int  GetSize(){
        return getSize();
    }*/


}