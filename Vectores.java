public class Vectores {

    /**
     * Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
     * muestre todos los valores y el resultado de su suma.
     */
    public static void vector1() {
        int []vector = new int[10];
        int suma = 0;

        for (int i = 0;i < vector.length;i++){
            vector[i] = Leer.leerEntero("Introduzca un número: ");
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El vector en la posición " + i + " és: " + vector[i]);
            suma = suma + vector[i];
        }

        System.out.println("El resultado de la suma es: " + suma);
    }

    /**
     * Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
     * lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
     */
    public static void vector2() {
        int []vector = new int[10];
        int maximo, minimo;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Leer.leerEntero("Introduzca un número: ");
        }

        maximo = vector[1];
        minimo = vector[1];

        for (int j : vector) {
            if (j > maximo) {
                maximo = j;
            } else if (j < minimo) {
                minimo = j;
            }
        }

        System.out.println("El valor máximo introducido es: " + maximo);
        System.out.println("El valor mínimo introducido es: " + minimo);
    }
}
