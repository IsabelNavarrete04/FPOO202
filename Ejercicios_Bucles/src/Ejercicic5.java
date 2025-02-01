import java.util.Scanner;
public class Ejercicic5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();

        System.out.println("Introduce una letra: ");
        char letra = scanner.next().charAt(0);

        int c=0;
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)==letra){
                c++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " +c+ " veces en la frase.");
    }
}
