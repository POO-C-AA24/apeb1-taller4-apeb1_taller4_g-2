/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos Sánchez
 */
public class Producto {

    private int cantidadProducto, precioProducto, precioTotal, descuentoProducto;

    public Producto(int cantidadProducto, int precioProducto) {
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.precioTotal = cantidadProducto * precioProducto;
    }

    //ESTE MÉTODO TOMARÁ LOS DATOS DEL CONSTRUCTOR PARA SIMPLIFICAR CODIGO
    //USAR UN NUEVO CONSTRUCTOR PARA CALCULAR UN PRODUCTO DIFERENTE.
    public int calcularDescuento() {
        if (cantidadProducto >= 10 && precioProducto >= 1000) {
            descuentoProducto = (int) (precioTotal * 0.1);
        } else {
            descuentoProducto = (int) (precioTotal * 0.05);
        }

        return descuentoProducto;
    }

    public int calcularPrecioFinal() {
        return precioTotal - descuentoProducto;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }
    
    
    
    
    
}
