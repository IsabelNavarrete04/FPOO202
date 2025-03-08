import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = null;
        Empleado empleado2 = null;

        while(true){
            String opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una opción:\n1. Agregar Empleado\n2. Listar Empleados\n3. Salir",
                    "Menú Empleados", JOptionPane.QUESTION_MESSAGE);

            if(opcion == null || opcion.equals("3")){
                break;
            }

            if(opcion.equals("1")){
                String tipo = JOptionPane.showInputDialog("Ingrese el tipo de empleado (Conductor o Administrativo):");
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID:"));
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:"));

                if(tipo.equals("Conductor")){
                    String licencia = JOptionPane.showInputDialog("Ingrese el número de licencia:");
                    empleado1 = new Conductor(nombre, id, salario, licencia);
                }else if (tipo.equals("Administrativo")) {
                    String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
                    empleado2 = new Administrativo(nombre, id, salario, departamento);
                }else{
                    JOptionPane.showMessageDialog(null, "Tipo de empleado no válido");
                }
                JOptionPane.showMessageDialog(null, "Empleado agregado correctamente");
            }else if (opcion.equals("2")){
                String lista = "Lista de Empleados:\n";
                if(empleado1 != null){
                    lista += "Empleado: " + empleado1.toString() + "\n";
                }
                if(empleado2 != null){
                    lista += "Empleado: " + empleado2.toString() + "\n";
                }
                if(empleado1 == null && empleado2 == null){
                    lista = "No hay empleados registrados.";
                }
                JOptionPane.showMessageDialog(null, lista, "Empleados", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
