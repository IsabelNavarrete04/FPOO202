import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = scn.nextLine();
        System.out.println(nombre.toUpperCase() + " tiene "+ nombre.length()+ " letras ");
    }
}
