import java.util.Scanner;
public class Examen1_Ejercicio2 {
    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String palabra1 = cadena.nextLine();
        System.out.println("Ingresa otra palabra: ");
        String palabra2 = cadena.nextLine();

        if (palabra1.length() >= palabra2.length()) {
            System.out.println(palabra1 + " es mas larga");
        } else {
            System.out.println(palabra2 + " es mas larga");
        }
    }
}
