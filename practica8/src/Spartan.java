public class Spartan {
    public String nombre;
    int escudo, salud;
    String armaPrincipal;

    public void mostrarInfo(){
      System.out.println("-----------Informcion del Spartan---------");
      System.out.println("Spartan: " + nombre);
      System.out.println("% de Salud: " + salud);
      System.out.println("% de Escudo: " + escudo);
      System.out.println("Arma disponible : " + armaPrincipal);
      System.out.println("------------------------------------------");
    }

    public void Atacar(String enemigo){
        System.out.println(nombre + " ataca a " + enemigo + " con "+ armaPrincipal);
    }

    public void RecargarArma(int municiones){
        int restantes = 10;
        int total = restantes + municiones;
        System.out.println(armaPrincipal + " ahora tiene disponible " + total + " balas");
    }
    public void Correr(boolean status){
       if (status){
           System.out.println(nombre + " esta corriendo");
    }else{
           System.out.println(nombre + " se detuvo");
       }
    }


}//llave de la clase
