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

    /**
     * Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego
     * lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
     */
    public static void vector5() {
        int[] vector = new int[20];
        int suma = 0, media;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Leer.leerEntero("Introduzca un número: ");
        }

        for (int j : vector) {
            suma += j;
        }

        media = suma / vector.length;
        System.out.println("La media de todos los valores introducidos es: " + media);
    }

    /**
     * Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba
     * M en todas sus posiciones y lo muestre por pantalla.
     */
    public static void vector6() {
        int n = Leer.leerEntero("Introduzca la longitud de la array: "), m = Leer.leerEntero("Introduzca otro valor numérico: ");
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = m;
        }

        System.out.println(vector);
    }

    /**
     * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1,
     * 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla.
     */
    public static void vector7() {
        int[] vector = new int[55];
        int iteraciones = 0;

        for (int i = 1; i <= 10; i++) {
            for (int x = 0; x < i; x++) {
                vector[iteraciones] = i;
                iteraciones++;
            }
        }
        System.out.println(Arrays.toString(vector));
    }

    /**
     * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distntas
     * opciones:
     * a. Mostrar valores
     * b. Introducir valor
     * c. Salir
     * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
     * posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
     * que el usuario elija la opción ‘c’ que terminará el programa.
     */
    public static void vector8() {
        int[] numeros = new int[10];
        int v, p;
        boolean permiso = false;
        String opc;

        do {
            System.out.println("A. Mostrar Valores.");
            System.out.println("B. Introducir un valor y posición.");
            System.out.println("C. Salir.");

            opc = Leer.leerTexto("¿Qué quiere hacer? ").toUpperCase();

            if (opc.equals("A")) {

                for (int numero : numeros) {
                    if (numero > 1) {
                        permiso = true;
                        break;
                    }
                }

                if (permiso) {
                    System.out.println("Los valores son: " + Arrays.toString(numeros));
                }

            } else if (opc.equals("B")) {

                v = Leer.leerEntero("Introduce un valor: ");
                p = Leer.leerEntero("Introduce una posición: ");

                numeros[p] = v;

            } else System.out.println("Valor introducido no válido.");
        } while (!opc.equals("C"));
    }

    /**
     * Crea un programa que cree un array de enteros de tamaño 30 y lo rellene con valores enteros
     * aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará cuántas
     * veces aparece en total y en qué posiciones del array.
     */
    public static void vector9() {
        int[] numeros = new int[30];
        double numAleatorio;
        int n, v = 0;

        for (int i = 0; i < numeros.length; i++) {
            numAleatorio = 1 + Math.random() * 10;
            numeros[i] = (int) numAleatorio;
        }

        n = Leer.leerEntero("Introduzca un número del 1 al 10 para buscarlo por la array: ");

        for (int i = 0; i < numeros.length; i++) {
            if (n == numeros[i]) {
                v++;
                System.out.println("Se ha encontrado en la posición: " + i + ".");
            }
        }
        System.out.println("El número " + n + " ha aparecido: " + v +  " veces.");
    }

    /**
     * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer
     * array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del primer array
     * al segundo array en orden inverso, y mostrar ambos por pantalla.
     */
    public static void vector10() {
        int[] vector1 = new int[100];
        int[] vector2 = new int[100];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = i + 1;
        }
        for (int x = 99; x >= 0; x--) {
            vector2[x] = vector1[99 - x];
        }
        System.out.println(Arrays.toString(vector1));
        System.out.println(Arrays.toString(vector2));
    }

    /**
     * Crea un programa que permita al usuario almacenar una progresión aritmética en un array y
     * luego mostrarla. Una progresión aritmética es una serie de números que comienza por un valor
     * inicial VI, y continúa con incrementos de desplazamiento D. Por ejemplo, con VI=1 e D=2, la
     * progresión sería 1, 3, 5, 7, 9… El programa solicitará al usuario VI, D y el número de valores a
     * generar N.
     */
    public static void vector11() {
        int vi, d, n;
        int[] vector = new int[20];

        vi = Leer.leerEntero("Introduzca el valor inicial: ");
        d = Leer.leerEntero("Introduce el incremento por desplazamiento: ");
        n = Leer.leerEntero("Introduce la cantidad de números a imprimir: ");

        vector[0] = vi;

        for (int i = 1; i < n; i++) {
            vector[i] = vector[i - 1] + d;
        }

        System.out.println("Progresión aritmética: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    /**
     * Crea un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez con 8
     * jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores
     * (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las puntuaciones en
     * orden descendente(de la más alta a la más baja).
     */
    public static void vector12() {

    }
}
