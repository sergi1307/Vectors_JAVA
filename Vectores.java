import java.util.Arrays;

public class Vectores {

    /**
     * Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
     * muestre todos los valores y el resultado de su suma.
     */
    public static void vector1() {
        int[] vector = new int[10];
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
        int[] vector = new int[10];
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

    /**
     * Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego
     * muestre por separado la suma de todos los valores positivos y la suma de los valores negativos
     */
    public static void vector3() {
        int[] vector = new int[20];
        int pos = 0, neg = 0;
        int sumPos = 0, sumNeg = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Leer.leerEntero("Introduzca un número: ");
        }

        for (int x : vector) {
            if (x > 0) {
                pos++;
                sumPos = sumPos + x;
            } else if (x < 0){
                neg++;
                sumNeg = sumNeg + x;
            }
        }

        System.out.println("Hay un total de: " + pos + " números positivos. Y la suma da: " + sumPos);
        System.out.println("Hay un total de: " + neg + " números negativos. Y la suma da: " + sumNeg);
    }

    /**
     * Programa que guarde los 100 primeros números pares en un vector. Después mostrará la suma
     * de los últimos 30 números guardados
     */
    public static void vector4() {
        int[] vector = new int[100];
        int numero = 2, suma = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = numero;
            numero += 2;
        }

        for (int i = vector.length - 30; i < vector.length; i++) {
            suma += vector[i];
        }

        System.out.println("Los 100 primeros números pares son: " + Arrays.toString(vector));
        System.out.println("La suma de los 30 últimos da: " + suma);
    }
}
