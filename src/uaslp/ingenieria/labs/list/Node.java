package uaslp.ingenieria.labs.list;

class Node {
    private int dato;
    private Node next;
    private Node previous;

    /*
    Codigo mio
    void setDato(int dato){
        this.dato = dato;
    }*/

    //como debe de ser el Set para dato, regresando un tipo "Node" es deicr etructura
    Node(int dato) {
        this.dato = dato;
    }

    //y tambien uno al parecer tambien un metodo para que regrese un int
    public void setData(int dato) {
        this.dato = dato;
    }


    public int getData(){
        return dato;
    }


    public void setNext(Node next){
        this.next = next;
    }


    public Node getNext(){
        return next;
    }


    public Node getPrevious(){
        return previous;
    }

    public void setPrevious(Node previous){
        this.previous = previous;
    }



}
