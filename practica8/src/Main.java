public class Main {
    public static void main(String[] args) {
        //creamos el primer objeto
        Spartan JefeMaestro = new Spartan();

        //usar atributos
        JefeMaestro.nombre = "John";
        JefeMaestro.salud = 100;
        JefeMaestro.escudo = 95;
        JefeMaestro.armaPrincipal = "Rifle de asalto";

        //invocamos los metodos
        JefeMaestro.mostrarInfo();
        JefeMaestro.Atacar("Grunt");
        JefeMaestro.RecargarArma(75);
        JefeMaestro.Correr(true);

        //Crear el segundo objeto

        Spartan Nin04in = new Spartan();
        Nin04in.nombre="Nin04in";
        Nin04in.salud = 89;
        Nin04in.escudo = 98;
        Nin04in.armaPrincipal = "Movimiento Unite";

        Nin04in.mostrarInfo();
        Nin04in.Atacar("ois98");
        Nin04in.RecargarArma(45);
        Nin04in.Correr(false);

    }
}