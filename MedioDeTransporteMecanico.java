public abstract class MedioDeTransporteMecanico extends MedioDeTransporte {

    public MedioDeTransporteMecanico(String nombre, int añoDeCreacion) {
        super(nombre, añoDeCreacion);
    }

    public abstract void encender();
    public abstract void apagar();
}
