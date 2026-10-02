import java.util.ArrayList;

public class ColaDinamica {

    // Atributos
    private ArrayList<String> cola;

    // Métodos
    // Constructor
    public ColaDinamica() {
        cola = new ArrayList<>();
    }

    // Operaciones
    private boolean estaVacia() {
        return cola.isEmpty();
    }

    public void insertar(String nodo) {
        cola.add(nodo);
    }

    public String eliminar(){
        if (estaVacia()) {
            System.out.println("La cola está vacía.\n");
            return null;
        }
        return cola.removeFirst();
    }

    public String verFrente() {
        if (estaVacia())  {
            System.out.println("La cola está vacía.\n");
            return null;
        }
        return cola.getFirst();
    }
}
