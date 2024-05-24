public class Funciones {
    // Calcular el descuento de un producto
    public static void main(String[] args) {
        calcularDescuento("Sueter", 40, 20);
    }
    public static void calcularDescuento(String producto, double precio, int descuento){
        double desAplicado = precio - (precio * descuento) / 100;
        System.out.println("El precio del producto " + producto + " con un descuento del " + descuento + "% ha quedado asi: " + desAplicado);
    }
}
