import java.util.Scanner;
public class Cadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String cadena = scanner.nextLine();
        String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase();
        String cadenaInvertida = new StringBuilder(cadenaLimpia).reverse().toString();
        if(cadenaLimpia.equals(cadenaInvertida)){
            System.out.println("La cadena es un palíndromo.");
        }else{
            System.out.println("La cadena no es un palíndromo.");
        }
    }
}
