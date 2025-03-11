public class Matricula {
    private String Nombre = "abcdefghijklmnopqrstuvwxyz";
    private String Ap = "abcdefghijklmnopqrstuvwxyz";
    private String Am = "abcdefghijklmnopqrstuvwxyz";
    private String anNacimiento = "0123456789";
    private String carrera = "abcdefghijklmnopqrstuvwxyz";
    String simbolos;

    public String generarMatricula(){
        String caracteres = Nombre + Ap + Am + anNacimiento + carrera + simbolos;
        String matricula = "";
        for (int i = 0; i < 2 ; i++){
            int car = (int) (Math.random() * caracteres.length());
            matricula += caracteres.substring(car, car + 1);
        }
        return matricula;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAp() {
        return Ap;
    }

    public void setAp(String ap) {
        Ap = ap;
    }

    public String getAm() {
        return Am;
    }

    public void setAm(String am) {
        Am = am;
    }

    public String getAnNacimiento() {
        return anNacimiento;
    }

    public void setAnNacimiento(String anNacimiento) {
        this.anNacimiento = anNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(String simbolos) {
        this.simbolos = simbolos;
    }

}


