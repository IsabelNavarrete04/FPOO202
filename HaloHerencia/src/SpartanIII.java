public class SpartanIII  extends Spartan{
    public SpartanIII(String nombre, int salud, String arma, int escudo){
        super(nombre,salud, arma, 80);
    }

    public void camufajleActivo(){
        System.out.println(nombre + " Activó camujafle para volverse invisible");
    }
}
