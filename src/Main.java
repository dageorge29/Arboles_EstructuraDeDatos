public class Main {
    static void main() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertar(50);
        bst.insertar(30);
        bst.insertar(70);
        bst.insertar(20);
        bst.insertar(40);

        System.out.println("Recorrido In-Order:");
        bst.recorrerInOrder(bst.raiz);
    }
}
