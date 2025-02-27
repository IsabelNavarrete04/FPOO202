import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(12345, "Isabel Navarrete", 19, 1000.0);

        int opcion;
        do{
            String input = JOptionPane.showInputDialog(
                    "Menú de operaciones:\n" +
                            "1. Consultar saldo\n" +
                            "2. Ingresar dinero\n" +
                            "3. Retirar dinero\n" +
                            "4. Depositar en otra cuenta\n" +
                            "5. Salir\n" +
                            "Elija una opción:"
            );
            opcion = Integer.parseInt(input);

            switch (opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo actual: " + cuenta1.getSaldo());
                    break;

                case 2:
                    String montoIngresarStr = JOptionPane.showInputDialog("Ingrese el monto a ingresar:");
                    double montoIngresar = Double.parseDouble(montoIngresarStr);
                    cuenta1.ingresar(montoIngresar);
                    JOptionPane.showMessageDialog(null, "Saldo actualizado: " + cuenta1.getSaldo());
                    break;

                case 3:
                    String montoRetirarStr = JOptionPane.showInputDialog("Ingrese el monto a retirar:");
                    double montoRetirar = Double.parseDouble(montoRetirarStr);
                    boolean retiroExitoso = cuenta1.retirar(montoRetirar);
                    if (retiroExitoso) {
                        JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo actualizado: " + cuenta1.getSaldo());
                    } else {
                        JOptionPane.showMessageDialog(null, "Retiro fallido. Fondos insuficientes o monto inválido.");
                    }
                    break;

                case 4:
                    String numeroOtraCuentaStr = JOptionPane.showInputDialog("Ingrese el número de la otra cuenta:");
                    int numeroOtraCuenta = Integer.parseInt(numeroOtraCuentaStr);
                    Cuenta otraCuenta = new Cuenta(numeroOtraCuenta, "Karla Navarrete", 25, 500.0);

                    String montoDepositarStr = JOptionPane.showInputDialog("Ingrese el monto a depositar:");
                    double montoDepositar = Double.parseDouble(montoDepositarStr);
                    boolean depositoExitoso = cuenta1.depositarOtraCuenta(otraCuenta, montoDepositar);
                    if (depositoExitoso) {
                        JOptionPane.showMessageDialog(null, "Depósito exitoso. Saldo cuenta1: " + cuenta1.getSaldo());
                        JOptionPane.showMessageDialog(null, "Saldo otra cuenta: " + otraCuenta.getSaldo());
                    }else{
                        JOptionPane.showMessageDialog(null, "Depósito fallido. Fondos insuficientes o monto inválido.");
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
                    break;
            }
        } while(opcion != 5);
    }
}