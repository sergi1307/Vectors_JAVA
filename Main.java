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

            opc = Leer.leerEntero("Que quiere hacer? ");

            if (opc == 1) {
                Vectores.vector1();
            } else if(opc == 2) {
                Vectores.vector2();
            }
        } while (opc != 0);

    }
}