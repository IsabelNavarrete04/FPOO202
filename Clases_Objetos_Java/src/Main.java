import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args){
        Cuenta cuenta1 = new Cuenta();
        cuenta1.Nocuenta = 12345;
        cuenta1.Titular = "Isabel Navarrete";
        cuenta1.Edad = 19;
        cuenta1.Saldo = 1000.0;

        int opcion;
        do {
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

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo actual: " + cuenta1.Saldo());
                    break;

                case 2:
                    String montoIngresarStr = JOptionPane.showInputDialog("Ingrese el monto a ingresar:");
                    double montoIngresar = Double.parseDouble(montoIngresarStr);
                    cuenta1.Ingresar(montoIngresar);
                    JOptionPane.showMessageDialog(null, "Saldo actualizado: " + cuenta1.Saldo());
                    break;

                case 3:
                    String montoRetirarStr = JOptionPane.showInputDialog("Ingrese el monto a retirar:");
                    double montoRetirar = Double.parseDouble(montoRetirarStr);
                    boolean retiroExitoso = cuenta1.Retirar(montoRetirar);
                    if (retiroExitoso) {
                        JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo actualizado: " + cuenta1.Saldo());
                    } else {
                        JOptionPane.showMessageDialog(null, "Retiro fallido. Fondos insuficientes o monto inválido.");
                    }
                    break;

                case 4:
                    String numeroOtraCuentaStr = JOptionPane.showInputDialog("Ingrese el número de la otra cuenta:");
                    int numeroOtraCuenta = Integer.parseInt(numeroOtraCuentaStr);
                    Cuenta otraCuenta = new Cuenta();
                    otraCuenta.Nocuenta = numeroOtraCuenta;
                    otraCuenta.Titular = "Karla Navarrete";
                    otraCuenta.Edad = 25;
                    otraCuenta.Saldo = 500.0;

                    String montoDepositarStr = JOptionPane.showInputDialog("Ingrese el monto a depositar:");
                    double montoDepositar = Double.parseDouble(montoDepositarStr);
                    boolean depositoExitoso = cuenta1.DepositarOtraCuenta(otraCuenta, montoDepositar);
                    if (depositoExitoso) {
                        JOptionPane.showMessageDialog(null, "Depósito exitoso. Saldo cuenta1: " + cuenta1.Saldo());
                        JOptionPane.showMessageDialog(null, "Saldo otra cuenta: " + otraCuenta.Saldo());
                    } else {
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
        } while (opcion != 5);
    }
}
