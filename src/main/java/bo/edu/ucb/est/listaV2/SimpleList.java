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

    
}
