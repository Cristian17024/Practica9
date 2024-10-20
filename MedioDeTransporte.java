import java.util.ArrayList;
import java.util.List;

public abstract class MedioDeTransporte {
    private String nombre;
    private int añoDeCreacion;
    private List<Mantenimiento> historialMantenimiento;

    public MedioDeTransporte(String nombre, int añoDeCreacion) {
        this.nombre = nombre;
        this.añoDeCreacion = añoDeCreacion;
        this.historialMantenimiento = new ArrayList<>();
    }

    public void agregarMantenimiento(Mantenimiento mantenimiento) {
        historialMantenimiento.add(mantenimiento);
    }

    public void agregarMantenimientos(List<Mantenimiento> mantenimientos) {
        historialMantenimiento.addAll(mantenimientos);
    }

    public List<Mantenimiento> getHistorialMantenimiento() {
        return historialMantenimiento;
    }

    public abstract void avanzar();
    public abstract void retroceder();
    public abstract void virar();
}
