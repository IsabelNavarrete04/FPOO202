public class Conductor extends Empleado{
    private String Licencia;

    public Conductor(String nombre, int id, double salario, String Licencia){
        super (nombre, id, salario);
        this.Licencia = Licencia;
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Licencia: " + this.Licencia);
    }
}
