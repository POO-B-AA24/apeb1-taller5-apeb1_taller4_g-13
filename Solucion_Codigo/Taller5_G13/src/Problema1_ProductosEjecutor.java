import java.util.ArrayList;
import java.util.Scanner;

public class Problema1_ProductosEjecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //añadimos las varibles a usar
        String nombre;
        int cantidad;
        double precio;
        Problema1_CarritoComprasBase venta = new Problema1_CarritoComprasBase();
        ArrayList<Problema1_CarritoComprasBase> producto = new ArrayList<>();
        // pedimos se ingrese el nombre y la cantidad
        System.out.println("Ingrese nombre del producto");
        nombre = entrada.nextLine();
        System.out.println("Ingrese cantidad a pedir");
        cantidad = entrada.nextInt();
        //mandamos el nombre y cantidad al objeto venta que usara uno de los metodos la otra clase
        venta.AgregarProducto(nombre, cantidad);
        //guardamos el valor sacado en el metodo en una nueva variable donde se descontara el descuento
        //en caso sea necesario, para usarla despues al mostrar los detalles
        double total = venta.CalcularTotal(cantidad);
        //predimos que se ingrese el monto para comparar si cubre el total
        System.out.println("Ingrese cantidad a ingresar para realizar pago");
        double montoP = entrada.nextDouble();
        //lo enviamos al metodo donde se indicara si cubre o no el monto
        venta.RealizarPago(montoP, total, cantidad);
        //enviamos lo necesario para hacer un tipo de factura donde se muestre los detalles de esta compra
        venta.MostrarDetalleCompra(nombre, cantidad, total, montoP);
    }
}
