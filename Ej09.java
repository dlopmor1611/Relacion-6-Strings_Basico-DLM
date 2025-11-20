import java.util.Scanner;

public class Ej09 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String cadena = "", subcadena = "";
        boolean coincide = false;

        System.out.print("Introduzca una cadena a comprobar si tiene una subcadena dentro: ");
        cadena = teclado.nextLine();

        System.out.print("Introduzca una subcadena a comprobar si esta en la cadena: ");
        subcadena = teclado.nextLine();

        if ( cadena.length() >= subcadena.length() ) {

            for (int i = 0; i <= cadena.length() - subcadena.length(); i++) {
                
                if ( cadena.substring(i, i + subcadena.length()).equals(subcadena) ) {
                    coincide = true;
                    break;
                }
            }
        }

        if ( coincide ) {
            System.out.println("La cadena contiene a la subcadena");
        } else {
            System.out.println("La cadena NO contiene a la subcadena");
        }

        teclado.close();
    }
}