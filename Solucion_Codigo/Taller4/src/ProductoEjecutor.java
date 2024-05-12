
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos Sánchez
 */
public class ProductoEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion, cantidadProductos, precioProductos;
        do {            
            System.out.println("Ingrese el precio del producto:");
            precioProductos = sc.nextInt();
            
            System.out.println("Ingrese la cantidad de productos: ");
            cantidadProductos= sc.nextInt();
            
            Producto producto = new Producto(cantidadProductos, precioProductos);
            
            System.out.println("El descuento de su producto es: " + producto.calcularDescuento());
            System.out.println("El precio original de su producto es: " + producto.getPrecioTotal());
            System.out.println("El precio con descuento de su producto es: " + producto.calcularPrecioFinal());
            
            
            System.out.println("Ingresar mas productos? || 0 = NO.  1 = SI");
            opcion = sc.nextInt();
        } while (opcion != 0);
    }
}
