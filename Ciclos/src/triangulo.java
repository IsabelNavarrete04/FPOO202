import java.util.Scanner;
public class triangulo{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número entero positivo:");
        int altura= scanner.nextInt();
        int i;
        int j;
        for(i=1; i<=altura; i++){
            for(j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
