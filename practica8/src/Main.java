public class Main {
    public static void main(String[] args) {
        //creamos el primer objeto
        Spartan JefeMaestro = new Spartan("John", 100, 95, "Rifle de asalto");

        /*//usar atributos
        JefeMaestro.setNombre("John");
        JefeMaestro.setSalud(100);
        JefeMaestro.setEscudo(95);
        JefeMaestro.setArmaPrincipal("Rifle de asalto");*/

        //invocamos los metodos
        JefeMaestro.mostrarInfo();
        JefeMaestro.Atacar("Grunt");
        JefeMaestro.RecargarArma(75);
        JefeMaestro.Correr(true);

//        JefeMaestro.consultaCortana();



        //usamos get y set para cambiar atributo nombre
        JefeMaestro.setNombre("Isabel");
        JefeMaestro.mostrarInfo();
        System.out.println(JefeMaestro.getNombre());

        //Crear el segundo objeto

        Spartan Nin04in = new Spartan("Nin04in",98, 89, "Movimiento Unite" );
        /*Nin04in.setNombre("Nin04in");
        Nin04in.setSalud(89);
        Nin04in.setEscudo(98);
        Nin04in.setArmaPrincipal("Movimiento Unite");*/

        Nin04in.mostrarInfo();
        Nin04in.Atacar("ois98");
        Nin04in.RecargarArma(45);
        Nin04in.Correr(false);

    }
}