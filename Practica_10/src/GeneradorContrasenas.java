public class GeneradorContrasenas{
    private String letras = "abcdefghijklmnopqrstuvwxyz";
    private String numeros = "0123456789";
    private String simbolos = "!@#$%^&*()";

    public String generarContrasena(int longitud, boolean mayusculas, boolean especiales){
        String caracteres = letras + numeros;
        if(mayusculas){
            caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if(especiales){
            caracteres += simbolos;
        }
        StringBuilder contrasena = new StringBuilder();
        for(int i = 0; i < longitud; i++){
            int car = (int) (Math.random() * caracteres.length());
            contrasena.append(caracteres.charAt(car));
        }
        return contrasena.toString();
    }

    public String comprobarFortaleza(String contrasena){
        boolean Tmayuscula = false;
        boolean Tespecial = false;

        for(int i = 0; i < contrasena.length(); i++){
            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) {
                Tmayuscula = true;
            }
            if (simbolos.contains(String.valueOf(c))){
                Tespecial = true;
            }
        }

        if(contrasena.length() >= 12 && Tmayuscula && Tespecial){
            return "Fuerte";
        }else if(contrasena.length() >= 8){
            return "Moderada";
        }else{
            return "Debil";
        }
    }
    public String getLetras(){
        return letras;
    }

    public void setLetras(String letras){
        this.letras = letras;
    }

    public String getNumeros(){
        return numeros;
    }

    public void setNumeros(String numeros){
        this.numeros = numeros;
    }

    public String getSimbolos(){
        return simbolos;
    }

    public void setSimbolos(String simbolos){
        this.simbolos = simbolos;
    }
}//llave de la clase
