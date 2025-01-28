import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Introdusca un numero: ");
        int  n = scn.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma de los enteros es: " + suma);
    }
}
