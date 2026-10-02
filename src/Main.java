public class Main {

    public static void main(String[] args) {

        System.out.println(factorial(5));


   //     ListaEnlazadaSimple albumes = new ListaEnlazadaSimple();


  //      albumes.insertarInicio("Nevermind", "Nirvana", (short)1991, "Grunge");
   //     albumes.insertarInicio("Kind of Blue", "Miles Davis", (short)1959, "Jazz");
   //     albumes.insertarInicio("Mirage", "Camel", (short)1974, "Progresivo");
   }

    // 5! = 5 * 4 * 3 * 2 * 1 = 5 * 4! = 120
    // 4! =     4 * 3 * 2 * 1 = 24
    // n! = n * ( n - 1 ) !

    public static int factorial(int n) {
        if (n < 0) throw new ArithmeticException("El factorial de un negativo no está definido.\n ");
        if (n == 0 || n == 1) return 1;
        return n * factorial( n - 1);
    }

}
