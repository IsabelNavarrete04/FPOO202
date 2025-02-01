import java.util.Scanner;
public class Arbol{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de asteriscos: ");
        int base = scanner.nextInt();
        int altura = (base + 1) / 2; //calcula la altura del triangulo
        int i = 1;
        while(i <= altura){
            int espacios = altura - i; //calcula la cantidad de espacios en blanco
            int asteriscos = 2 * i - 1; //calcula la cantidad de asteriscos
            int j = 0;
            while (j < espacios){
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j < asteriscos) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
