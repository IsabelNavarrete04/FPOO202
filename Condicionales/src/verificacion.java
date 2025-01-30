import java.util.Scanner;
public class verificacion{
    public static void main(String[] args){
        String contrag = "condicionales";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la contrasena :");
        String contra = scanner.nextLine();
        if(contrag.toLowerCase().equals(contra.toLowerCase())){
            System.out.println("¡La contraseña es correcta!");
        }else{
            System.out.println("La contraseña es incorrecta");
        }
    }
}
