import lectura.*;

public class Matrices {

    /**
     * Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25 y
     * luego muestre la matriz por pantalla.
     */
    public static void matrices1() {
        int[][] matriz = new int[5][5];
        int contador = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de multiplicar del 1 al 10
     * (cada tabla en una fila). Luego mostrará la matriz por pantalla.
     */
    public static void matrices2() {
        int[][] tablas = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Crea un programa que cree una matriz de tamaño 3x6 que almacene los números aleatorios
     * entre 1 y 20. Luego pedirá al usuario un valor y mostrará si ese valor está en la matriz o no
     */
    public static void matrices3() {
        int[][] numeros = new int[3][6];
        int valor;
        boolean encontrado = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                numeros[i][j] = (int) (Math.random() * 20) + 1;
            }
        }

        do {
            valor = Lectura.leerEntero("Introduzca un valor a buscar entre 1 y 20: ");
        } while (valor < 1 || valor > 20);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (numeros[i][j] == valor) {
                    encontrado = true;
                    break;
                }
            }
        }

        if (encontrado) System.out.println("El número si está en la matriz");
        else System.out.println("El número no ha sido encontrado.");
    }

    /**
     * Crea un programa que cree una matriz del tamaño que quiera el usuario y que almacene números
     * aleatorios entre 5 y 30. Luego pedirá al usuario un valor y mostrará, si ese valor está en la matriz,
     * en qué posición está (número de fila y número de columna)
     */
    public static void matrices4() {
        int columnas = Lectura.leerEntero("Introduzca una cantidad de columnas: "), filas = Lectura.leerEntero("Introduzca una cantidad de filas: "), valor;
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int)(Math.random() * 26) + 5;
            }
        }

        do {
            valor = Lectura.leerEntero("Introduzca un valor a buscar: ");
        } while (valor < 5 || valor > 30);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == valor) {
                    System.out.println("El valor ha sido encontrado en la columna: [" + i + "] y en la fila: [" + j + "].");
                }
            }
        }
    }

    /**
     * Hacer un programa que lea 4 notas de 5 alumnos, todas ellas entre 0 y 10. A continuación, para
     * cada alumno se calculará:
     * - La nota más alta
     * - La nota más baja
     * - La nota media
     * - Informar si ha habido algún 10 y/o algún 0
     * Sabiendo la media total de las notas calcularemos cuántos alumnos tienen una nota inferior a la media
     * y cuántos tienen una nota superior.
     */
    public static void matrices5() {
        int[][] notas = new int[5][4];
        double[] media = new double[5];
        int nota, maxima, minima, suma= 0;
        int alumnosencima = 0, alumnosdebajo = 0;
        boolean diez, cero;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                do {
                    nota = Lectura.leerEntero("Introduzca la nota nº: " + (j + 1) + " al alumno nº " + (i + 1) + ": ");
                } while (nota < 0 || nota > 10);
                notas[i][j] = nota;
            }
        }

        for (int i = 0; i < 5; i++) {
            maxima = 0;
            minima = 10;
            suma = 0;
            diez = false;
            cero = false;

            for (int j = 0; j < 4; j++) {
                suma = suma + notas[i][j];
                if (notas[i][j] > maxima) {
                    maxima = notas[i][j];
                }
                if (notas[i][j] < minima) {
                    minima = notas[i][j];
                }
                if (notas[i][j] == 10) {
                    diez = true;
                } else if (notas[i][j] == 0) {
                    cero = true;
                }
            }
            media[i] = suma / 4.0;

            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("- Nota máxima: " + maxima + ".");
            System.out.println("- Nota mínima: " + minima + ".");
            System.out.println("- Nota media: " + media[i] + ".");
            System.out.println("- Algún 10: " + diez + ".");
            System.out.println("- Algún 0: " + cero + ".");
        }

        double mediaTotal = 0;
        for (double j : media) {
            mediaTotal += j;
        }
        mediaTotal /= 5;

        for (double x: media) {
            if (x >= mediaTotal) {
                alumnosencima++;
            } else {
                alumnosdebajo++;
            }
        }

        System.out.println("Media total de las notas: " + mediaTotal + ".");
        System.out.println("Alumnos por encima de la media: " + alumnosencima + ".");
        System.out.println("Alumnos por debajo de la media: " + alumnosdebajo + ".");
    }

    /**
     * Crear un programa para registrar sueldos de hombres y mujeres de una empresa y detectar si
     * existe brecha salarial entre ambos. El programa pedirá por teclado la información de N personas
     * distintas (valor también introducido por teclado). Para cada persona, pedirá su género (0 para
     * varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única matriz. Luego
     * se mostrará por pantalla el sueldo medio de cada género.
     */
    public static void matrices6() {
        int n = Lectura.leerEntero("Introduzca el número de personas de las que quiere ingresar sueldos: ");
        int[][] sueldos = new int[n][2];
        double mediaHombres = 0.0, mediaMujeres = 0.0;
        int sumaHombres = 0, sumaMujeres = 0;
        int contadorHombres = 0, contadorMujeres = 0;

        int genero;
        for (int i = 0; i < n; i++) {
            do {
                genero = Lectura.leerEntero("Introduzca el género de la persona" + (i + 1) + "(0 para hombre 1 para mujer): ");
            } while (genero != 0 && genero != 1);
            sueldos[i][0] = genero;

            int sueldo;
            do {
                sueldo = Lectura.leerEntero("Introduzca el sueldo de la persona" + (i + 1) + ": ");
            } while (sueldo < 0);
            sueldos[i][1] = sueldo;

            if (genero == 0) {
                sumaHombres += sueldo;
                contadorHombres++;
            } else {
                sumaMujeres += sueldo;
                contadorMujeres++;
            }
        }
        if (contadorHombres > 0) {
            mediaHombres = (double) sumaHombres / contadorHombres;
        }
        if (contadorMujeres > 0) {
            mediaMujeres = (double) sumaMujeres / contadorMujeres;
        }

        System.out.println("Sueldo medio de los hombres: " + mediaHombres + ".");
        System.out.println("Sueldo medio de las mujeres: " + mediaMujeres + ".");

        if (mediaHombres > mediaMujeres) {
            System.out.println("Existe una brecha salarial a favor de los hombres.");
        } else if (mediaMujeres > mediaHombres) {
            System.out.println("Existe una brecha salarial a favor de las mujeres");
        } else {
            System.out.println("No existe la brecha salarial.");
        }

    }

        /**
         * Haz un programa que pida el número de expediente, nota y edad de 15 alumnos (con un único
         * bucle). Posteriormente, que muestre en formato de tabla todos los datos. Después se pedirá por
         * teclado un número de expediente y se mostrará por pantalla su edad y nota.
         */
        public static void matrices7 () {
        }

        /**
         * En un centro meteorológico queremos guardar las temperaturas de un mes (30 días), medidas 4
         * veces al día (a las 0, 6, 12 y 18 horas de cada día).
         * Para lo cual se guardará la información en una matriz. El programa pedirá el día del cual queremos
         * introducir las temperaturas y, a continuación pedirá las 4 temperaturas correspondientes. Este proceso
         * irá repitiéndose hasta que introducimos el día 0.
         * Posteriormente, el programa presentará un menú para que el usuario haga un análisis de los datos
         * recolectados:
         * 1. Temperatura media de un día pedido por teclado.
         * 2. Temperatura media de una hora pedida por teclado.
         * 3. Temperatura media del mes.
         * 4. Mostrar temperatura en un día y hora en concreto.
         * 5. Mostrar la mínima y la máxima de un día.
         * 6. Cambiar una temperatura.
         * 7. Salir.
         */
        public static void matrices8 () {
        }
    }
