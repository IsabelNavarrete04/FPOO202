//Zona de importaciones
import java.util.Scanner;

//Clase principal
public class Main{
    //Metodo principal
    public static void main(String[] args){
       /*System.out.println("Hola, segundo intento :( ");

        System.out.println("Hola, segundo intento :( ");
        System.out.println("Hola, segundo intento :( ");
        System.out.println("Hola, segundo intento :( ");*/

        // 2. CADENAS

        //conteo de longitud de cadena
        String cadena = "isabel" + "atilano" + "navarrete";
        System.out.println(cadena.length());

        //Extracción de caracteres en base a parámetros
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));

        //3. Variables
        String cadena2;
        int entero = 3, entero2, entero3;
        double decimal = 3.33589, decimal2, decimal3;

        //Convertir cadena a int
        cadena2 = "333";
        entero2 = Integer.parseInt(cadena2);
        System.out.println(entero2);

        //Convertir double a int
        entero3 = (int) decimal;
        System.out.println(entero3);

        //Convertir double a cadena
        cadena2 = String.valueOf(decimal);
        System.out.println(cadena2);

        //Convertir int a double
        decimal2 = Double.valueOf(entero);
        System.out.println(decimal2);

        //Conversión implícita
        int i = 12;
        double numd = i;
        System.out.println(numd);

        //4. Solicitar Información
        Scanner scn = new Scanner(System.in);

        System.out.println("Escribe una cadena: ");
        cadena = scn.nextLine();

        System.out.println("Escribe un número entero: ");
        int enteroInput = scn.nextInt();

        System.out.println("Escribe un número decimal: ");
        double decimalInput = scn.nextDouble();

        System.out.println("Número decimal guardado: " + decimalInput);
        System.out.println("Número entero guardado: " + enteroInput);
        System.out.println("Cadena guardada: " + cadena);

        //5. Boolean, operadores lógicos y de comparación
        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);

        //Operadores lógicos
        int x = 3;
        System.out.println(x < 5 && x > 10);
        System.out.println(x < 5 || x > 10);
        System.out.println(!(x < 5 && x > 10));
        System.out.println(!(x < 5 || x > 10));
    }
}
