import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = scn.nextLine();

        String frase2 = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            frase2 += frase.charAt(i);
        }
        System.out.println(frase2);

    }
}
