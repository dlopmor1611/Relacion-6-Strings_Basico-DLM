import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String cad = "", cadcar = "";
        char car = ' ';
        int cont = 0;

        System.out.print("Introduzca una cadena: ");
        cad = teclado.nextLine();

        do {

            System.out.print("Introduzca un unico caracter: ");
            cadcar = teclado.nextLine();

            if ( cadcar.length() != 1 ) {

                System.out.println("ERROR: Esto no es un caracter");
            } else {

                car = cadcar.charAt(0);
            }

        } while ( cadcar.length() != 1 );

        for ( int i = 0; i < cad.length()-1 ; i++ ) {
            if (car == cad.charAt(i)) {
            cont++;
        }

        }

        System.out.println("El caracter " + car + " aparece " + cont + " vez/veces en esta cadena");

        teclado.close();
    }

}
