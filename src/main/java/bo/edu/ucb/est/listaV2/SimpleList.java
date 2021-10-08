package bo.edu.ucb.est.listaV2;

public class SimpleList <N> {
    private Node<N> first;
    private int size;

    public SimpleList() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(Node<N> node) {
        size++;
        if (first == null) {
            first = node;
        } else {
            for (Node<N> current = first ; current != null; current = current.getNext() ) {
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
