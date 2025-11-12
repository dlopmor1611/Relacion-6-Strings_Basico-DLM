import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String cad1 = "", cad2 = "";

        System.out.print("Introduzca una cadena: ");
        cad1 = teclado.nextLine();

        System.out.print("Introduzca una subcadena: ");
        cad2 = teclado.nextLine();

        if ( cad1.startsWith(cad2) ) {
            System.out.println("La cadena empieza por la subcadena");
        } else {
            System.out.println("La cadena no empieza por la subcadena");
        }

        teclado.close();
    }
}