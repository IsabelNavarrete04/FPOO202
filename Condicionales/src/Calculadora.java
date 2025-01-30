import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double n1 = scanner.nextDouble();
        System.out.println("Ingresa otro numero: ");
        double n2 = scanner.nextDouble();
        System.out.println("Ingrese un operador (+, -, *, /): ");
        char o = scanner.next().charAt(0);
        double resultado;
        switch (o){
            case '+':
                resultado = n1+ n2;
                System.out.println("El resultado es: " + resultado);
                break;
                case '-':
                    resultado = n1- n2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                    case '*':
                        resultado = n1 * n2;
                        System.out.println("El resultado es: " + resultado);
                        break;
                    case '/':
                        if(n2 != 0){
                            resultado = n1 / n2;
                            System.out.println("El resultado es: " + resultado);
                        }
                        break;
                    default:
                        System.out.println("Operador no valido");
                        break
          }
    }
}
