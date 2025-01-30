import java.util.Scanner;
public class Sala_Juegos{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad = scanner.nextInt();
        int precio;
        if(edad < 4){
            precio = 0;
            }else if(edad <= 18){
            precio = 110;
            }else{
              precio = 190;
            }
        System.out.println("El precio de la entrada es: $" + precio);



        }
    }


