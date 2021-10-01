package bo.edu.ucb.est.listaV2;

public class Node {

    private Student data;
    private Node next;   // apuntadorASiguiente (antes en Alumno)
    
    public Node(Student data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
