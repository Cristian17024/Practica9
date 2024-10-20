public class Avion extends MedioDeTransporteMecanico {

    public Avion(String nombre, int añoDeCreacion) {
        super(nombre, añoDeCreacion);
    }

    @Override
    public void encender() {
        System.out.println("El avión está encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El avión está apagado");
    }

    @Override
    public void avanzar() {
        System.out.println("El avión avanza");
    }

    @Override
    public void retroceder() {
        System.out.println("El avión no retrocede");
    }

    @Override
    public void virar() {
        System.out.println("El avión está girando");
    }
}
