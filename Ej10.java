import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String cadena = "", cadenaInvertida = "";

        System.out.print("Introduzca una cadena para comprobar si es o no un palindromo: ");
        cadena = teclado.nextLine();

        for ( int i = cadena.length()-1 ; i >= 0; i-- ) {
            
            cadenaInvertida += cadena.charAt(i);

        }

        if ( cadena.equals(cadenaInvertida) ) {
            
            System.out.println("La cadena dada es un palindromo");
        } else {

            System.out.println("La cadena dada NO es un palindromo");
        }

        teclado.close();
    }

}