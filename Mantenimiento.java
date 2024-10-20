import java.util.Date;

public class Mantenimiento {
    private String tipo;
    private Date fecha;
    private double costo;

    public Mantenimiento(String tipo, Date fecha, double costo) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getCosto() {
        return costo;
    }
}
