import javax.swing.JOptionPane;
class Entrega {
    private String numeroGuia;
    private String estado;

    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void actualizarEstado(){
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese nuevo estado (En transito/Entregado):");
        if(nuevoEstado.equals("En transito") || nuevoEstado.equals("Entregado")){
            estado = nuevoEstado;
        }else{
            JOptionPane.showMessageDialog(null, "Estado no valido");
        }
    }
}//llave de la clase