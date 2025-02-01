public class Ejercicio3 {
        public static void main(String[] args) {
            int i;
            int j;
            for(i=1; i<=10; i++) {
                System.out.println("Tabla de multiplicar del "+i+":");
                for(j=1; j<=10; j++){
                    System.out.println(i+"x"+j+"= "+(i*j));
                }
                System.out.println();
            }
        }
    }
