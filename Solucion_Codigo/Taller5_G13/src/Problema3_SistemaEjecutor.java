public class Problema3_SistemaEjecutor {
    public static void main(String[] args) {
        Problema3_EmpresaBase2 empresa = new Problema3_EmpresaBase2("Al toque digital", "1345634756", "Av. Buenos Aires Central");

        Problema3_DepartamentoBase1 departamento1 = new Problema3_DepartamentoBase1("IndustriasDigital", 30, 1500000);
        Problema3_DepartamentoBase1 departamento2 = new Problema3_DepartamentoBase1("EraAudiovisual", 20, 1000000);
        Problema3_DepartamentoBase1 departamento3 = new Problema3_DepartamentoBase1("Ministro", 10, 500000);

        empresa.agregarDepartamento(departamento1);
        empresa.agregarDepartamento(departamento2);
        empresa.agregarDepartamento(departamento3);
        
        empresa.mostrarInformacionEmpresa();
    }
}
