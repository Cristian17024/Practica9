public class Autobus extends MedioDeTransporteMecanico {

    public Autobus(String nombre, int añoDeCreacion) {
        super(nombre, añoDeCreacion);
    }

    @Override
    public void encender() {
        System.out.println("El autobús está encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El autobús está apagado");
    }

    @Override
    public void avanzar() {
        System.out.println("El autobús avanza");
    }

    @Override
    public void retroceder() {
        System.out.println("El autobús retrocede");
    }

    @Override
    public void virar() {
        System.out.println("El autobús está girando");
    }
}
