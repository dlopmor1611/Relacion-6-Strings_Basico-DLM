import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String cadena = "", cadenaInvertida = "";

        System.out.print("Introduzca una cadena: ");
        cadena = teclado.nextLine();

        for ( int i = cadena.length()-1 ; i >= 0; i-- ) {
            
            cadenaInvertida += cadena.charAt(i);

        }

        System.out.println(cadenaInvertida);

        teclado.close();
    }

}