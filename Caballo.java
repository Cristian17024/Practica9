public class Caballo extends MedioDeTransporteAnimal {

    public Caballo(String nombre, int añoDeCreacion) {
        super(nombre, añoDeCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println("El caballo avanza");
    }

    @Override
    public void retroceder() {
        System.out.println("El caballo retrocede");
    }

    @Override
    public void virar() {
        System.out.println("El caballo está dando la vuelta");
    }

    @Override
    public void preparar() {
        System.out.println("El caballo está listo");
    }

    @Override
    public void descansar() {
        System.out.println("El caballo está descansando");
    }
}
