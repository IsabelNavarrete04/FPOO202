import javax.swing.JOptionPane;
public class Cuenta {
    public int Nocuenta;
    public String Titular;
    public int Edad;
    public double Saldo;

    public double Saldo() {
        return Saldo;
    }

    public void Ingresar(double montos) {
        if(montos > 0) {
            Saldo += montos;
        } else {
            JOptionPane.showMessageDialog(null, "El monto debe ser positivo");
        }
    }

    public boolean Retirar(double montos) {
        if (montos > 0 && Saldo >= montos) {
            Saldo -= montos;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes o monto inválido");
            return false;
        }
    }

    public boolean DepositarOtraCuenta(Cuenta otraCuenta, double montos) {
        if(montos > 0 && Saldo >= montos) {
            Saldo -= montos;
            otraCuenta.Ingresar(montos);
            return true;
        }else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes o monto inválido");
            return false;
        }
    }
}//llave de la clase
