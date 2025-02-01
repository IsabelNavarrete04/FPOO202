import java.util.Scanner;
public class cuenta_bancaria {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int saldo=0;
            String operacion;
            System.out.println("Escriba la bitacora de operaciones (D (depositar), R (retirar), Espacio vacio (mostrar saldo))");
            do{
                operacion=scanner.nextLine().trim(); //elimina cualquier espacio en blanco.
                if(operacion.isEmpty()){
                    break;
                }
                char tipoOperacion = operacion.charAt(0);
                int cantidad = Integer.parseInt(operacion.substring(2).trim());
                switch (tipoOperacion){
                    case 'D':
                        saldo += cantidad;
                        break;
                    case 'R':
                        saldo -= cantidad;
                        break;
                    default:
                        System.out.println("Operacion no valida");
                        break;
                }
            } while (!operacion.isEmpty()); //devuelve true en el caso de que el tamaño de la cadena sera 0.
            System.out.println("Saldo final: "+ saldo +" pesos");
        }
    }
