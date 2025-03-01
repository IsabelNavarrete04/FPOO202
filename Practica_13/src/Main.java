import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        Entrega entrega = null;

        int opcion;
        do {
            String menu = "Menu:\n" +
                    "1. Registrar Vehículo\n" +
                    "2. Registrar Conductor\n" +
                    "3. Asignar Conductor a Vehículo\n" +
                    "4. Registrar Envío\n" +
                    "5. Registrar Entrega\n" +
                    "6. Actualizar Estado de Entrega\n" +
                    "7. Mostrar Información\n" +
                    "8. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    vehiculo = new Vehiculo(
                            JOptionPane.showInputDialog("Ingrese la placa del vehículo:"),
                            JOptionPane.showInputDialog("Ingrese el modelo del vehículo:"),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga:"))
                    );
                    break;
                case 2:
                    conductor = new Conductor(
                            JOptionPane.showInputDialog("Ingrese el nombre del conductor:"),
                            JOptionPane.showInputDialog("Ingrese la identificación:"),
                            JOptionPane.showInputDialog("Ingrese la licencia:")
                    );
                    break;
                case 3:
                    if (vehiculo != null && conductor != null) {
                        vehiculo.asignarConductor(conductor);
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe registrar un vehículo y un conductor primero");
                    }
                    break;
                case 4:
                    envio = new Envio(
                            JOptionPane.showInputDialog("Ingrese el código de envío:"),
                            JOptionPane.showInputDialog("Ingrese el destino:"),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso:"))
                    );
                    break;
                case 5:
                    entrega = new Entrega(JOptionPane.showInputDialog("Ingrese el número de guía:"));
                    break;
                case 6:
                    if (entrega != null) {
                        entrega.actualizarEstado();
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay entregas registradas");
                    }
                    break;
                case 7:
                    String info = "Información:\n" +
                            (vehiculo != null ? "Vehículo: " + vehiculo.getPlaca() + ", " + vehiculo.getModelo() + "\n" : "No hay vehículo registrado\n") +
                            (conductor != null ? "Conductor: " + conductor.getNombre() + "\n" : "No hay conductor registrado\n") +
                            (envio != null ? "Envío: " + envio.getCodigoEnvio() + ", " + envio.getDestino() + "\n" : "No hay envío registrado\n") +
                            (entrega != null ? "Entrega: " + entrega.getNumeroGuia() + ", Estado: " + entrega.getEstado() + "\n" : "No hay entrega registrada\n");
                    JOptionPane.showMessageDialog(null, info);
                    break;
            }
        } while (opcion != 8);
    }
}