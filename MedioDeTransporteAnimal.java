public abstract class MedioDeTransporteAnimal extends MedioDeTransporte {

    public MedioDeTransporteAnimal(String nombre, int añoDeCreacion) {
        super(nombre, añoDeCreacion);
    }

    public abstract void preparar();
    public abstract void descansar();
}
