public class GeneradorContrasenas{
   public String generarContrasena (int longitud,  boolean mayusculas,  boolean especiales){
        String letras = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()";

        String caracteres = letras + numeros;
        if (mayusculas){
            caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (especiales){
            caracteres += simbolos;
        }
        String contrasena = "";
        for (int i = 0; i < longitud; i++){
            int car = (int) (Math.random() * caracteres.length());
            contrasena += caracteres.substring(car, car + 1);
        }
        return contrasena;
    }
    public String comprobarFortaleza(String contrasena){
        boolean Tmayuscula = false;
        boolean Tespecial = false;
        String simbolos = "!@#$%^&*()";

        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.substring(i, i + 1).charAt(0);

            if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(c + "")) {
                Tmayuscula = true;
            }
            if (simbolos.contains(c + "")) {
                Tespecial = true;
            }
        }

        if (contrasena.length() >= 12 && Tmayuscula && Tespecial) {
            return "Fuerte";
        }else if (contrasena.length() >= 8) {
            return "Moderada";
        }else {
            return "Débil";
        }
   }
}//llave de la clase
