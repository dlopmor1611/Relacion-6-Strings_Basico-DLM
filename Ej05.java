import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String nombreCompleto = "", iniciales = "", palabra = "";

        System.out.print("Introduzca su nombre completo: ");
        nombreCompleto = teclado.nextLine();

        nombreCompleto+=" ";

        for ( int i = 0; i < nombreCompleto.length() ; i++ ) {
            
            if ( nombreCompleto.charAt(i) != ' ' ) {
                
                palabra += nombreCompleto.charAt(i);

            } else {

                iniciales += palabra.substring(0, 1);
                palabra = "";
                
            }

        }

        
        System.out.println("Las iniciales de ese nombre son: " + iniciales.toUpperCase());

        teclado.close();
    }

}