import lectura.Lectura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int opc;

        do {
            System.out.println("1 - Vectores 1");
            System.out.println("2 - Vectores 2");
            System.out.println("3 - Vectores 3");
            System.out.println("4 - Vectores 4");
            System.out.println("5 - Vectores 5");
            System.out.println("6 - Vectores 6");
            System.out.println("7 - Vectores 7");
            System.out.println("8 - Vectores 8");
            System.out.println("9 - Vectores 9");
            System.out.println("10 - Vectores 10");
            System.out.println("11 - Vectores 11");
            System.out.println("12 - Vectores 12");
            System.out.println("13 - Matrices 1");
            System.out.println("14 - Matrices 2");
            System.out.println("15 - Matrices 3");
            System.out.println("16 - Matrices 4");
            System.out.println("17 - Matrices 5");
            System.out.println("18 - Matrices 6");
            System.out.println("19 - Matrices 7");
            System.out.println("20 - Matrices 8");

            opc = Lectura.leerEntero("Que quiere hacer? ");

            if (opc == 1) {
                Vectores.vector1();
            } else if(opc == 2) {
                Vectores.vector2();
            } else if(opc == 3) {
                Vectores.vector3();
            } else if(opc == 4) {
                Vectores.vector4();
            } else if(opc == 5) {
                Vectores.vector5();
            } else if(opc == 6) {
                Vectores.vector6();
            } else if(opc == 7) {
                Vectores.vector7();
            } else if(opc == 8) {
                Vectores.vector8();
            } else if(opc == 9) {
                Vectores.vector9();
            } else if(opc == 10) {
                Vectores.vector10();
            } else if(opc == 11) {
                Vectores.vector11();
            } else if(opc == 12) {
                Vectores.vector12();
            } else if(opc == 13) {
                Matrices.matrices1();
            } else if(opc == 14) {
                Matrices.matrices2();
            } else if(opc == 15) {
                Matrices.matrices3();
            } else if(opc == 16) {
                Matrices.matrices4();
            } else if(opc == 17) {
                Matrices.matrices5();
            } else if(opc == 18) {
                Matrices.matrices6();
            } else if(opc == 19) {
                Matrices.matrices7();
            } else if(opc == 20) {
                Matrices.matrices8();
            }
        } while (opc != 0);

    }
}