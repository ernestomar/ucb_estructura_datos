package bo.edu.ucb.est;

public class Lista {
    private int tamanio;
    private Alumno primerElemento;
    public Lista() {
        tamanio = 0;
        primerElemento = null;
    }

    public void agregar(Alumno alumno) {
        tamanio++;
        if (primerElemento == null) {
            primerElemento = alumno;
        } else { // Recorremos la lista para agregar al final el nuevo alumno
            Alumno nodoActual = primerElemento;
            while (nodoActual != null) {
                if (nodoActual.getApuntadorASiguiente() == null) {
                    nodoActual.setApuntadorASiguiente(alumno);
                }
                nodoActual = nodoActual.getApuntadorASiguiente();
            }
        }
    }

    public void imprimir() {
        Alumno nodoActual = primerElemento;
        while (nodoActual != null) {
            System.out.print( nodoActual.getNombreCompleto() + " -> ");
            nodoActual = nodoActual.getApuntadorASiguiente();
        }
        System.out.println( " |. ");
    }


    public Alumno obtener(int posicion) {
        Alumno resultado = null;
        if (tamanio != 0) {
           // FOR INICIALIZAR ; CONDICIÓN PARA SEGUIR EN BUCLE; LUEGO CADA ITERACION 
            int i = 0;
            for (Alumno nodoActual = primerElemento ; nodoActual != null ; nodoActual = nodoActual.getApuntadorASiguiente() ) {
                if (posicion == i) {
                    resultado = nodoActual;
                    break;
                }
                i++;
            }
        }
        return resultado;
    }

    public void eliminar(int posicion) {
        if (tamanio != 0) {
           // FOR INICIALIZAR ; CONDICIÓN PARA SEGUIR EN BUCLE; LUEGO CADA ITERACION 
            int i = 0;
            Alumno nodoAnterior = null;
            //malloc(nodoAnterior)
            for (Alumno nodoActual = primerElemento ; nodoActual != null ; nodoActual = nodoActual.getApuntadorASiguiente() ) {
                if (posicion == i) {
                    // Eliminar el nodo actual
                    if ( nodoAnterior == null) { // Significa que estoy eliminando el primer elemento
                        primerElemento = nodoActual.getApuntadorASiguiente();
                    } else { // Si tenemos nodoAnterior es un elemento de en medio o el utlimo.
                        nodoAnterior.setApuntadorASiguiente(nodoActual.getApuntadorASiguiente()); 
                        // free(nodoActual);
                    }
                    break;
                }
                i++;
                nodoAnterior = nodoActual;
            }
        }
    }

    public int metodo (int x , int y) {
        if (y == 0) {
            return 1;
        } else {
            return metodo (x , y -1 ) * x;
        }
    }

    // metodo (2,3) = 8

    public int getTamanio() {
        return tamanio;
    }
}
