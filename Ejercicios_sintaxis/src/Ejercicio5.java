import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int mp = 75;
        int pp = 112;

        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce el total de muñecas a enviar: ");
        int m = scn.nextInt();
        System.out.println("Introduce el total de payasos a enviar: ");
        int p = scn.nextInt();

        int pesomu = mp * m;
        int pesopa = pp * p;
        int suma = pesomu + pesopa;

        System.out.println("El peso de las muñecas es de: " + pesomu + " g");
        System.out.println("El peso de los payasos es de: " + pesopa + " g");
        System.out.println("El peso total es de: " + suma + " g");







    }
}
