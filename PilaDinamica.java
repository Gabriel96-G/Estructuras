import java.util.ArrayList;

public class PilaDinamica {

    // Atributos
    private ArrayList<String> pila;

    // Métodos
    // Constructor
    public PilaDinamica() {
        pila = new ArrayList<>();
    }

    //Operaciones
    private boolean estaVacia() {
        return pila.isEmpty();
    }

    public void push(String nodo) {
        pila.add(nodo);
    }

    public String pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. \n");
            return null;
        }

        return pila.removeLast();
    }

    public String peek() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. \n");
            return null;
        }
        return pila.getLast();
    }
}
