import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        HomePage homePage = new HomePage();

        System.out.print("Por favor, selecciona la ópcion de tu interes:");
        System.out.println("pulsa 0 para salir.\n" +
                "pulsa 1 validar la garantia de un producto.\n" +
                "pulsa 2  extender la garantia de un producto.\n" +
                "pulsa 3 para ver el estado del envio de un producto.");
        Scanner scan = new Scanner(System.in);
        int eleccion = scan.nextInt();
        switch (eleccion){
            case 0:
                System.out.println("Hasta luego, fue un placer atenderlo");
                break;

            case 1:
                System.out.println("introduce el codigo del item a revisar");
                scan = new Scanner(System.in);
                eleccion = scan.nextInt();
                homePage.vigenciaGarantia(eleccion);
                break;

            case 2:
                System.out.println("Introduce codigo del item");
                scan = new Scanner(System.in);
                eleccion = scan.nextInt();
                homePage.extenderGarantia(eleccion);
                break;
            case 3:
                System.out.println("introduce el codigo del item a revisar");
                scan = new Scanner(System.in);
                eleccion = scan.nextInt();
                homePage.estadodeEntrega(eleccion);
                break;
        }

    }
}