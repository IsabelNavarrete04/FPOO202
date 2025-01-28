import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Escribe tu nombre completo: ");
        String nombre = scn.nextLine();

        System.out.println("Nombre completo en minusculas: " + nombre.toLowerCase());
        System.out.println("Nombre completo en mayusculas: " + nombre.toUpperCase());

    }
}
