public class Main {
    public static void main(String[] args) {
       SpartanII jefemaestro = new SpartanII("John", 90, "rifle de asalto", 0);
       jefemaestro.mostrarInfo();
       jefemaestro.usarManejoAvanzado();
       jefemaestro.atacar("Convenant");
       jefemaestro.recibirDano(50);
       jefemaestro.recargarEscudo();

       SpartanIII Kick78 = new SpartanIII("Kick78", 70, "Sable azul", 6);
       Kick78.mostrarInfo();
       Kick78.camufajleActivo();
       Kick78.atacar("Grunt");
       Kick78.recibirDano(48);
       Kick78.recargarEscudo();

       SpartanIV Jhi89 = new SpartanIV("SM6700", 20, "Cable dorado", 2);
       Jhi89.mostrarInfo();
       Jhi89.usarPropulsores();
       Jhi89.atacar("Koala");
       Jhi89.recibirDano(20);
       Jhi89.recargarEscudo();

    }
}