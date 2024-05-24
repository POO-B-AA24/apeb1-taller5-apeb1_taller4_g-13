import java.util.ArrayList;
import java.util.List;
public class Problema3_EmpresaBase2 {
    private String nombre;
    private String ruc;
    private String direccion;
    private List<Problema3_DepartamentoBase1> departamentos;

    public Problema3_EmpresaBase2(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Problema3_DepartamentoBase1 departamento) {
        departamentos.add(departamento);
    }

    public void mostrarInformacionEmpresa() {
        System.out.println("Nombre de la Empresa: " + nombre);
        System.out.println("RUC: " + ruc);
        System.out.println("Dirección: " + direccion);
        System.out.println("Departamentos:");
        for (Problema3_DepartamentoBase1 departamento : departamentos) {
            System.out.println(departamento);
        }
    }
}
