public class ListaEnlazadaSimple {
    // Atributos
    private NodoLista primero;

    //Métodos
    //Constructor
    public ListaEnlazadaSimple() {
        primero = null;
    }


    // Getters
    private NodoLista getPrimero() {
        return primero;
    }

    // Setters
    private void setPrimero(NodoLista primero) {
        this.primero = primero;
    }


    // Operaciones

    private boolean estaVacia() {
        return primero == null;
    }

    public void insertarInicio(String titulo, String artista, short anioPublicaion, String genero) {
        NodoLista nodo = new NodoLista(titulo, artista, anioPublicaion, genero);
        nodo.setSiguiente(primero);
        setPrimero(nodo);
    }

    public NodoLista buscar(String titulo) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.\n");
            return null;
        }
        NodoLista temp = primero;
        while (temp != null){
            if (titulo.equals(temp.getTitulo())) return temp;
            temp = temp.getSiguiente();
        }
        System.out.println("El título no está en la lista.\n");
        return null;
    }

    public void insertarFin(String titulo, String artista, short anioPublicacion, String genero){
        NodoLista nodo = new NodoLista(titulo, artista, anioPublicacion, genero);
        if (estaVacia()) {
            setPrimero(nodo);
            return;
        }

        NodoLista temp = primero;
        while (temp.getSiguiente() != null) temp = temp.getSiguiente();
        temp.setSiguiente(nodo);

        // Si está vacía, se pone el nodo al inicio
        // Si no, recorremos la lista hasta encontrar el último nodo y a ese le ponemos el nuevo
        // como siguiente

    }

        public NodoLista eliminar(String titulo) {

         if (estaVacia()) {
                System.out.println("La lista está vacía.\n ");
                return null;
         }
         NodoLista anterior = primero;
         NodoLista temp = anterior;
         while (temp != null) {
             if (titulo.equals(temp.getTitulo())) break;
             anterior = temp;
             temp = temp.getSiguiente();
         }
         if (temp != null) {
            anterior.setSiguiente(temp.getSiguiente());
            return temp;
         } else {


             System.out.println("El título no está en la lista.\n ");
             return null;
        }
    }

        // Si está vacía, se da un mensaje explicativo y se retorna  un null
        // Si no está vacía, declaro las variables auxiliares anterior y temp, las coloco juntas en el primero
        // y comienzo un ciclo en el que cada vez que temp no sea null ni igual al buscado, ambas dan un paso
        // Si se salió del ciclo porque se encontró el dato, se elimina y se retoma el temp
        // Si se salió del ciclo por que se encontró null, se da un mensaje explicativo y se retoma un null



    public void mostrarLista(){
        if (estaVacia()) {
            System.out.println("La lista está vacía.\n ");
            return;
        }
        NodoLista temp = primero;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getSiguiente();

        }
        // Si está vacía, se da un mensaje explicativo y se retorna  un null
        // Se recorre de inicio a fin, imprimiendo cada nodo al que se llega en el camino
    }

    private class NodoLista {


        //Atributos
        private String titulo;
        private String artista;
        private short anioPublicacion;
        private String genero;
        private NodoLista siguiente;

        // Métodos
        // Constructor
        public NodoLista(String titulo, String artista, short anioPublicaion, String genero) {
            this.titulo = titulo;
            this.artista = artista;
            this.anioPublicacion = anioPublicaion;
            this.genero = genero;
            siguiente = null;
        }

        // Getters
        public String getTitulo() {
            return titulo;
        }

        public String getArtista() {
            return artista;
        }

        public short getAnioPublicacion() {
            return anioPublicacion;
        }

        public String getGenero() {
            return genero;
        }

        public NodoLista getSiguiente() {
            return siguiente;
        }

        // Setters
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setArtista(String artista) {
            this.artista = artista;
        }

        public void setAnioPublicacion(short anioPublicacion) {
            this.anioPublicacion = anioPublicacion;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public void setSiguiente(NodoLista siguiente) {
            this.siguiente = siguiente;
        }

        // toString()
        @Override
        public String toString() {
            return "\nTítulo: " + titulo + "\nArtista: " + artista + "\nAño de publicación: " +
                    anioPublicacion + "\nGénero: " + genero + "\n";
        }
    }

}