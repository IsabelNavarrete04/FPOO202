import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la contraseña:"));
        int opcionMayus = JOptionPane.showConfirmDialog(null, "¿Desea incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean mayusculas = (opcionMayus == JOptionPane.YES_OPTION);
        int opcionEspeciales = JOptionPane.showConfirmDialog(null, "¿Desea incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean especiales = (opcionEspeciales == JOptionPane.YES_OPTION);
        GeneradorContrasenas generador = new GeneradorContrasenas();
        String contrasena = generador.generarContrasena(longitud, mayusculas, especiales);
        String fortaleza = generador.comprobarFortaleza(contrasena);
        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasena + "\nFortaleza: " + fortaleza);
    }
}
