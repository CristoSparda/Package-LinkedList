package uaslp.ingenieria.labs.list;

public class Iterador {
    private Node currentnode;

    //Constructor
    public Iterador(Node currentnode){
        this.currentnode = currentnode;
    }

    //asigna el nodo actual para que este a la par con la lista
    public Iterador(Iterador iterador){
        currentnode = iterador.currentnode;
    }

    //checa si tiene otro dato el iterador en su campo siguiente?
    public boolean hasNext(){
        return currentnode != null;
    }

    //recorre y obtiene el siguiente dato del iterador
    public int next(){
        int data = currentnode.getData();

        currentnode = currentnode.getNext();

        return data;

    }
    //modificador de acceso se llama -> package-private
    Node getCurrentnode(){
        return currentnode;
    }

}
