import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce tus horas trabajadas: ");
        int enteroInput = scn.nextInt();

        System.out.println("Introduce el coste por hora trabajada: ");
        double decimalInput = scn.nextDouble();

        double a= enteroInput * decimalInput;

        System.out.println("Tu Salario es de: " + a);






    }
}