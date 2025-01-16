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

            opc = Leer.leerEntero("Que quiere hacer? ");

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
            }
        } while (opc != 0);

    }
}