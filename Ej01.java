import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String nombre = "";

        System.out.print("Introduzca su nombre: ");
        nombre = teclado.nextLine();

        for ( int i = 0; i < nombre.length(); i++ ) {
            System.out.println(nombre.charAt(i));
        }

        teclado.close();
    }
}