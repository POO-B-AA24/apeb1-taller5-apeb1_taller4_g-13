public class Problema1_CarritoComprasBase {

    int cantidadD = 100;
    String productos = "Aceite";
    double precio = 20;
    String producto;
    double descuento = 10;

    public void AgregarProducto(String nombre, int cantidad) {
        CalcularTotal(cantidad);
        if (nombre.equals(productos)) {
            if (cantidad <= cantidadD) {
            } else {
                System.out.println("Cantidad pedida es mayor a la disponible "
                        + "de: " + cantidadD);
            }
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    public double CalcularTotal(int cantidad) {
        double total;
        total = cantidad * precio;
        if (total >= 1000) {
            total = total -(total * (descuento/100));
        }
        return total;
    }

    public void RealizarPago(double montoP, double total, int cantidad) {
        if (montoP >= total) {
            System.out.println("Gracias por su compra");
            cantidadD = cantidadD - cantidad;
        } else {
            double diferencia = total - montoP;
            System.out.println("El monto ingresado para pagar no cubre el gasto total"
                    + "por un margen de: " + diferencia);
        }

    }

    public void MostrarDetalleCompra(String nombre, int cantidad, double total, double montoP) {
        if (total >= 1000) {
            producto = "FACTURA\nNombre del producto: " + nombre + "\nCantidad pedida: " + cantidad + "\nCPrecio: " + precio
                    + "\nTotal de la compra: " + total + "\nMonto pagado: " + montoP + "\nDescuento: " + descuento+"%";
            System.out.println(producto);
        } else {
            producto = "FACTURA\nNombre del producto: " + nombre + "\nCantidad pedida: " + cantidad + "\nCPrecio: " + precio
                    + "\nTotal de la compra: " + total + "\nMonto pagado: " + montoP;
            System.out.println(producto);
        }
    }

}
