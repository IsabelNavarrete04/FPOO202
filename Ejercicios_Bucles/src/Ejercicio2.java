import java.util.Scanner;
public class Ejercicio2{
        public static void main(String[] args){
            Scanner numero= new Scanner(System.in);
            System.out.println("Introduce un numero entero positivo: ");
            int n=numero.nextInt();
            System.out.print("Inverso: ");
            for(int i=n; i>= 0; i--){
                System.out.print(i);
                if(i>0){
                    System.out.print(", ");
                }
            }
        }
    }
