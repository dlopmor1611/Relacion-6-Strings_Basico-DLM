import java.util.Scanner;

public class Ej08 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String cadena = "", cadenaModificada = "";

        System.out.print("Introduzca una cadena para cambiar mayusculas a minusculas: ");
        cadena = teclado.nextLine();

        for ( int i = 0; i < cadena.length(); i++ ) {
            
            if ( cadena.charAt(i) == cadena.toUpperCase().charAt(i) ) {
                
                cadenaModificada += cadena.toLowerCase().charAt(i);

            } else {
                
                cadenaModificada += cadena.toUpperCase().charAt(i);

            }

        }

        System.out.println(cadenaModificada);

        teclado.close();
    }

}