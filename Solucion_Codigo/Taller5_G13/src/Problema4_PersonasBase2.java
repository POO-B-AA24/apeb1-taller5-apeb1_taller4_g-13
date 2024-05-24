import java.util.Scanner;

public class Problema4_PersonasBase2 {

    public String ocupacion;
    public String nombreAcusado;
    public String nivelImplicacion;
    public double sentencia;
    public double dangerT;
    double fianza;
    Scanner entrada = new Scanner(System.in);

    public Problema4_PersonasBase2(String ocupacion, String nombreAcusado, String nivelImplicacion, double sentencia, double dangerT) {
        this.ocupacion = ocupacion;
        this.nombreAcusado = nombreAcusado;
        this.nivelImplicacion = nivelImplicacion;
        this.sentencia = sentencia;
        this.dangerT = dangerT;
    }

    public void ReducPena() {
        if (nivelImplicacion.equals("Acusado")) {
            System.out.println("Desea comfesar? S/N");
            String x = entrada.nextLine();
            switch (x) {
                case "S":
                    if (sentencia < 1) {
                        System.out.println("Tiene que pagar un fianza equivalente a un monto menor al 50% valor del daño ocacionado:");
                        this.fianza = this.dangerT * 0.50;
                    }
                    break;
                case "N":
                    System.out.println("Dada su rehuso no se puede ayudar al valor de su fianza");
                    break;
            }

        } else {
            System.out.println("No se le ofrecera una fianza");
        }

    }

    @Override
    public String toString() {
        return "Personas{" + "ocupacion=" + ocupacion + ", nombreAcusado=" + nombreAcusado + ", nivelImplicacion=" + nivelImplicacion + ", sentencia=" + sentencia + ", dangerT=" + dangerT + " fianza=" + fianza + '}';
    }

}
