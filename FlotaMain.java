import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FlotaMain {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("UABC", "Calle 2");

        Autobus autobus = new Autobus("Autobus", 2010);
        Bicicleta bicicleta = new Bicicleta("Bicicleta", 2018);
        Caballo caballo = new Caballo("Caballo", 2015);
        Avion avion = new Avion("Avion", 2020);

        Flota flota = empresa.getFlota();
        flota.agregarTransporte(autobus);
        flota.agregarTransporte(bicicleta);
        flota.agregarTransporte(caballo);
        flota.agregarTransporte(avion);

        System.out.println("Cantidad de transportes en la flota: " + flota.getCantidadTransportes());

        List<MedioDeTransporte> nuevosTransportes = Arrays.asList(
            new Autobus("Autobus", 2012),
            new Bicicleta("Bicicleta", 2019)
        );
        flota.agregarTransportes(nuevosTransportes);

        System.out.println("Cantidad de transportes nuevos: " + flota.getCantidadTransportes());

        Mantenimiento mantenimiento1 = new Mantenimiento("Aceite", new Date(), 1234);
        Mantenimiento mantenimiento2 = new Mantenimiento("Revisión", new Date(), 1234);
        
        autobus.agregarMantenimiento(mantenimiento1);
        avion.agregarMantenimiento(mantenimiento2);

        List<Mantenimiento> mantenimientosExtra = Arrays.asList(
            new Mantenimiento("Frenos", new Date(), 1234),
            new Mantenimiento("Limpieza", new Date(), 1234)
        );
        autobus.agregarMantenimientos(mantenimientosExtra);

        autobus.encender();
        autobus.avanzar();
        autobus.virar();
        autobus.retroceder();
        autobus.apagar();

        bicicleta.avanzar();
        bicicleta.virar();

        caballo.preparar();
        caballo.avanzar();
        caballo.virar();
        caballo.retroceder();
        caballo.descansar();

        avion.encender();
        avion.avanzar();
        avion.virar();
        avion.retroceder();
        avion.apagar();

        System.out.println("Mantenimientos del autobús:");
        for (Mantenimiento m : autobus.getHistorialMantenimiento()) {
            System.out.println(" - " + m.getTipo() + " el " + m.getFecha() + " por " + m.getCosto());
        }
    }
}
