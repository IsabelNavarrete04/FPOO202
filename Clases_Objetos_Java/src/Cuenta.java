import javax.swing.JOptionPane;
public class Cuenta {
    private int noCuenta;
    private String titular;
    private int edad;
    private double saldo;

    public void ingresar(double monto){
        if (monto > 0) {
            saldo += monto;
        } else{
            JOptionPane.showMessageDialog(null, "El monto debe ser positivo");
        }
    }

    public boolean retirar(double monto) {
        if(monto > 0 && saldo >= monto){
            saldo -= monto;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes o monto inválido");
            return false;
        }
    }

    public boolean depositarOtraCuenta(Cuenta otraCuenta, double monto){
        if(monto > 0 && saldo >= monto){
            saldo -= monto;
            otraCuenta.ingresar(monto);
            return true;
        } else{
            JOptionPane.showMessageDialog(null, "Fondos insuficientes o monto inválido");
            return false;
        }
    }
    //gets & sets
    public int getNoCuenta(){
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta){
        this.noCuenta = noCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }
}//llave de la clase
