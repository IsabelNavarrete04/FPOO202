public class Administrativo  extends Empleado{
    private String Departamento;

    public Administrativo(String nombre, int id, double salario, String Departamento){
        super (nombre, id, salario);
        this.Departamento = Departamento;
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Departamento: " + this.Departamento);
    }
}
