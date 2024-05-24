
public class Problema4_CasosCorrupcionBase1 {

    public String nombreCaso;
    public int fechaInicio;
    public String estadoCaso;
    public String detalles;
    public int fechaActual;

    public Problema4_CasosCorrupcionBase1(String nombreCaso, int fechaInicio, String estadoCaso, String detalles, int fechaActual) {
        this.nombreCaso = nombreCaso;
        this.fechaInicio = fechaInicio;
        this.estadoCaso = estadoCaso;
        this.detalles = detalles;
        this.fechaActual = fechaActual;
    }

    public void VerfEstado() {
        int diastrascurridos = fechaActual - fechaInicio;
        if (diastrascurridos > 7 && diastrascurridos > 14) {
            this.estadoCaso = "Alerta";
        } else {
            if (diastrascurridos > 14) {
                this.estadoCaso = "Urgente";
            }
        }
    }

    @Override
    public String toString() {
        return "CasosCorrupcion{" + "nombreCaso=" + nombreCaso + ", fechaInicio=" + fechaInicio + ", estadoCaso=" + estadoCaso + ", detalles=" + detalles + ", fechaActual=" + fechaActual + '}';
    }

}
