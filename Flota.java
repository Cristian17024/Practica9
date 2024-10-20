import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<MedioDeTransporte> transportes;
    public Flota() {
        this.transportes = new ArrayList<>();
    }

    public void agregarTransporte(MedioDeTransporte transporte) {
        transportes.add(transporte);
    }

    public void agregarTransportes(List<MedioDeTransporte> transportes) {
        this.transportes.addAll(transportes);
    }

    public void eliminarTransporte(MedioDeTransporte transporte) {
        transportes.remove(transporte);
    }

    public List<MedioDeTransporte> getTransportes() {
        return transportes;
    }

    public int getCantidadTransportes() {
        return transportes.size();
    }
}
