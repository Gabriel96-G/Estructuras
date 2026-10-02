public class PilaEstatica {

    //Atributos
    private String[] pila;
    private int top;

    // Métodos
    // Constructor
    public PilaEstatica(int longitud) {
        pila = new String[longitud];
        top = -1;
    }

    //Operaciones
    private boolean estaVacia() {
        return top == -1;
        }

    private boolean estaLlena() {
        return top == pila.length - 1;
        }

     public void push(String nodo) {
        if  (estaLlena()) {
            System.out.println("La pila está llena. \n");
            return;
        }
        pila[++top] = nodo;
      }

      public String pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. \n");
            return null;
        }
        return pila[top--];
      }

      public String peek() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. \n");
            return null;
        }
        return pila[top];
      }


    }

