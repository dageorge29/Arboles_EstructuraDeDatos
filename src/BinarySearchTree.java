public class BinarySearchTree {
    Nodo raiz;

    public BinarySearchTree() {
        raiz = null;
    }

    // Método público para insertar
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