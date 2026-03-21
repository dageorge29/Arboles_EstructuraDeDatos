public class Nodo {
    //Todo esto indica las posiciones en que se moverá el algoritmo, siendo:
    //  I R D      ->      o bien -> Izquierda, Raíz, Derecha. En caso de no haber uno de estos,
    //  continúa al siguiente o el que exista


    int valor;
    Nodo izquierdo, derecho;

    //Constructor que le asigna valores a los atributos
    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }
}

