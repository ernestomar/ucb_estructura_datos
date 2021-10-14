package bo.edu.ucb.est.listaV2;

public class SimpleList <T> {
    private Node first;
    private int size;

    public SimpleList() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(T data) {
        Node node = new Node(data, null);
        size++;
        if (first == null) {
            first = node;
        } else {
            for (Node current = first ; current != null; current = current.getNext() ) {
                if (current.getNext() == null ) { // es el ultimo nodo
                    current.setNext(node); // Enlazo el ultimo nodo.
                    break;
                }
            }
        }
    }

    public void print() {
       for (Node current = first; current != null ; current = current.getNext()) {
           System.out.print( current.getData() + " -> ");
       } 
       System.out.println(" |. ");
    }

    public boolean contains(T data) {
        boolean result = false;
        for (Node current = first; current != null ; current = current.getNext()) {
            if ( current.getData().equals(data)) {
                result = true;
                break;
            }
        } 
        return result;
    }

    // public getData(int i) //obtener un elemento
    // public contains(T data) // Retorna true si la lista contiene el elemento.
    // public remove(T data) // Remueve el elemento
    // public remove(int i) // Remueve el elemento de la posicion i especifgicada.

    
}
