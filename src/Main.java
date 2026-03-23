import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("======================\nTREE DSA\n======================");
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertar(50);
        bst.insertar(30);
        bst.insertar(70);
        bst.insertar(20);
        bst.insertar(40);

        System.out.println("Recorrido In-Order:");
        bst.recorrerInOrder(bst.raiz);

        boolean validar = false;
        System.out.println("\n===============================");
        do {
            System.out.println("\nDeseas buscar un número? (y/n)");
            char opc = sc.next().charAt(0);
            if (opc == 'y') {
                System.out.println("\nIngresa un número para buscarlo en el arbol");
                int numAbuscar = sc.nextInt();
                boolean existeNumero = bst.existeValor(bst.raiz, numAbuscar);
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
