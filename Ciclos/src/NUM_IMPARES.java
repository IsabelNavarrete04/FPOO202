import java.util.Scanner;
public class NUM_IMPARES {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo:");
        int n=scanner.nextInt();

        System.out.print("Numeros impares desde 1 hasta " + n + ": ");
        for(int i=1; i<=n; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}
