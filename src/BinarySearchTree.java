public class BinarySearchTree {
    //Esta es la clase que asigna y realiza el algoritmo IN ORDEN de acuerdo a los números
    //Este algoritmo se mueve en tres posiciones y usa recursión para volver al nodo raíz en caso
    // de no existir una hoja como movimiento previo


    Nodo raiz;

    //Es null por defecto
    public BinarySearchTree() {
        raiz = null;
    }

    // Insertar valores
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    // Lógica recursiva para colocar el nodo en su lugar
    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }

        return actual;
    }

    // Método para recorrer el árbol (In-order: Izquierda - Raíz - Derecha)
    public void recorrerInOrder(Nodo nodo) {
        if (nodo != null) {
            recorrerInOrder(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerInOrder(nodo.derecho);
        }
    }
}