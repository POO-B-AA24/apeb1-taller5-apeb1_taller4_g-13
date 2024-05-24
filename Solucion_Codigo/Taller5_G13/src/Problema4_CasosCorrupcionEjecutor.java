import java.util.Scanner;

public class Problema4_CasosCorrupcionEjecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Problema4_CasosCorrupcionBase1 obj = new Problema4_CasosCorrupcionBase1("Asalto a mano armada",
                3, "Iniciado",
                "El uso de un arma de fuego y el despojo de pertenencias ajenas", 15);
        Problema4_PersonasBase2 obj2 = new Problema4_PersonasBase2("Periodista", "Juan Martinez", "Acusado", 1, 300);
        boolean salir = true;

        do {
            System.out.println("Ingresar la opcion deseada\n Menu:\nVerificar Estado [1]\nReduccionPena [2]\nCerrar [0]");
            int opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    obj.VerfEstado();
                    System.out.println(obj);
                    break;
                case 2:
                    obj2.ReducPena();
                    System.out.println(obj2);
                    break;
                case 0:
                    salir = false;
                    break;
            }

        } while (salir);
    }
}