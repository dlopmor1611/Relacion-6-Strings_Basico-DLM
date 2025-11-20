import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String cad = "", cadcar = "", cadCambiada="";
        char car1 = ' ', car2 = ' ';

        System.out.print("Introduzca una cadena: ");
        cad = teclado.nextLine();

        do {

            System.out.print("Introduzca un unico caracter a cambiar por otro: ");
            cadcar = teclado.nextLine();

            if ( cadcar.length() != 1 ) {

                System.out.println("ERROR: Esto no es un caracter");
            } else {

                car1 = cadcar.charAt(0);
            }

        } while ( cadcar.length() != 1 );

        cadcar = "";

        do {

            System.out.print("Introduzca un unico caracter el cual cambiara al anterior: ");
            cadcar = teclado.nextLine();

            if ( cadcar.length() != 1 ) {

                System.out.println("ERROR: Esto no es un caracter");
            } else {

                car2 = cadcar.charAt(0);
            }

        } while ( cadcar.length() != 1 );

        cadCambiada = cad.replace(car1, car2);

        System.out.println(cadCambiada);

        teclado.close();
    }

}
