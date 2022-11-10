import java.util.*;

class ShoppingList {
    static Vector<String> vec = new Vector<String>();

    static void insertElem(int index, String elem) {
        try {
            vec.insertElementAt(elem, index);
            System.out.println("Element has been Successfully inserted at the index " + index);
            printElem();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void deleteElem(String elem) {
        vec.removeElement(elem);
        System.out.println("Deleted Element : " + elem);
        printElem();
    }

    static void printElem() {
        Enumeration enu = vec.elements();
        System.out.println("The Contents of vector are : ");
        while (enu.hasMoreElements()) {
            System.out.print(enu.nextElement());
            System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertElem(0, "Complan");
        insertElem(1, "RedBull");
        insertElem(2, "Chips");
        insertElem(3, "Biscuit");
        deleteElem("Chips");
    }
}
