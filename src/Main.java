import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("======================\nTREE DSA\n======================");
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        //Determina la cantidad de hojas en el arbol
        System.out.println("Ingresa la cantidad de números que tendrá el árbol");
        int cantidadHojas = sc.nextInt();
        for (int i = 0; i < cantidadHojas; i++) {
            System.out.println("Ingresa un número: ");
            bst.insertar(sc.nextInt());
        }

        //Hace el recorrido del algoritmo en el arbol
        System.out.println("Recorrido In-Order:");
        bst.recorrerInOrder(bst.raiz);

        boolean validar = false;
        System.out.println("\n===============================");
        do {
            //Buscar núemero
            System.out.println("\nDeseas buscar un número? (y/n)");
            char opc = sc.next().charAt(0);
            if (opc == 'y') {
                System.out.println("\nIngresa un número para buscarlo en el arbol");
                int numAbuscar = sc.nextInt();
                boolean existeNumero = bst.existeValor(bst.raiz, numAbuscar); //Valida que exista el número buscando en todas sus direcciones
                System.out.println("Existe? " + existeNumero);
                validar = true;
            }
            if (opc == 'n') {
                validar = true;
            }

        } while (validar == false);
        System.out.println("Gracias por usar este programa :D");


    }

}
