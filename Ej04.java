import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contar = 0;
        String frase = "";

        System.out.print("Introduzca una frase: ");
        frase = teclado.nextLine();

        frase+=" ";

        for ( int i = 0; i < frase.length() ; i++ ) {
            
            if (frase.charAt(i) == ' ') {
                
                contar++;
            }

        }

        System.out.println("En esta frase hay " + contar + " palabras");

        teclado.close();
    }
}