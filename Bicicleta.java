public class Bicicleta extends MedioDeTransporteMecanico {
    
    public Bicicleta(String nombre, int anoDeCreacion) {
        super(nombre, anoDeCreacion); 
    }

    @Override
    public void avanzar() {
        System.out.println("La bicicleta esta avanzando");
    }

    @Override
    public void retroceder() {
        System.out.println("La bicicleta no retrocede");
    }

    @Override
    public void virar() {
        System.out.println("La bicicleta esta en la curva");
    }

}